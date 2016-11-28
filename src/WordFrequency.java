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

    public int count(String line){
        int total = 0;
        //List<String> splited;
        if (!line.isEmpty())
            total = process(line,"[\\w]+");
        return total;
    }

    public int count(String line,String word) {
        return this.count(line);
    }

    private int process(String line, String regex) {
        Set<String> result = new HashSet<String>();

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);

        while (m.find()) {
            result.add(m.group(0));
        }
        return result.size();
    }

    private int process(String line,String regex,String word) {
        Map<String,Integer> result = new HashMap<String,Integer>();

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);

        while (m.find()) {
            String verbum = m.group(0);
            if (result.containsKey(verbum)) {
                int aux = result.get(verbum);
                result.put(verbum,aux++);
            }

        }
        return result.get(word).intValue();

    }
}
