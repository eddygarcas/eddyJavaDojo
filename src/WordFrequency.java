import javax.swing.border.MatteBorder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eddy on 11/25/16.
 */
public class WordFrequency {


    public WordFrequency() {
    }

    public int count(String... sententia){
        int total = 0;

        if (!sententia[0].isEmpty() && sententia.length == 1)
            total = process(sententia[0],"[\\w]+");
        else if (!sententia[0].isEmpty() && !sententia[1].isEmpty())
            total = process(sententia[0],"[\\w]+",sententia[1]);
        return total;
    }


    private int process(String... caudex) {

        final boolean uniqueCount = caudex.length > 2 ? true : false;

        final Set<String> countWords = new HashSet<String>();

        final Map<String,Integer> singleWord = new HashMap<String, Integer>();

        Pattern p = Pattern.compile(caudex[1]);
        Matcher m = p.matcher(caudex[0]);

        while (m.find()) {
            String verbum = m.group(0);

            if ( uniqueCount) {
                 if (singleWord.containsKey(verbum)) {
                     int aux = singleWord.get(verbum).intValue();
                     singleWord.put(verbum, ++aux);
                 } else
                     singleWord.put(verbum, 1);
            } else {
                countWords.add(verbum);
            }
        }

        return uniqueCount ? singleWord.get(caudex[2]).intValue() : countWords.size();

    }
}
