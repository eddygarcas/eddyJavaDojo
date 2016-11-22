import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by eddy on 11/21/16.
 */
public class StringCalculator {

    private StringBuffer name;

    public StringCalculator(String name) {
        this.name = new StringBuffer(name);
    }


    public int add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {

            char separator = ' ';
            if (numbers.substring(0,2).equals("//")){
                separator = numbers.charAt(2);
            }
            List<String> num = Arrays.asList(numbers.split(String.valueOf(separator)));
            for (Iterator<String> it = num.iterator(); it.hasNext();){
                int operator = Integer.parseInt(it.next());
                sum += operator;
            }
        }
        return sum;

    }
}
