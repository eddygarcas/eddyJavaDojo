import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            findNegativeNumbers(numbers);
            sum = sumPositiveNumbers(numbers);
        }
        return sum;
    }

    private int sumPositiveNumbers(String numbers) {
        int sum = 0;
        Matcher m = Pattern.compile("[0-9]+").matcher(numbers);
        while (m.find()) {
            sum += Integer.parseInt(m.group(0));
        }
        return sum;
    }

    private void findNegativeNumbers(String numbers) throws NumberFormatException {

        Pattern p = Pattern.compile("-[0-9]+");
        Matcher m = p.matcher(numbers);

        int total = 0;
        String excep = "";
        while (m.find()) {
            excep += m.group(0) + ",";
            total++;
        }

        if (total == 1) {
            throw new NumberFormatException("Negatives are not allowed" + excep);
        }else if (total > 1) {
            throw new NumberFormatException("Negatives are not allowed" + excep);
        }
    }
}

            /*char separator = ' ';
            if (numbers.substring(0,2).equals("//")){
                separator = numbers.charAt(2);
                numbers = numbers.substring(3,numbers.length());
            }*/
//List<String> num = new ArrayList<String>(Arrays.asList(numbers.split(String.valueOf(separator))));
            /*List<String> num = new ArrayList<String>(Arrays.asList(numbers.split("[\\W]|")));
            num.removeAll(Arrays.asList("",null));
            for (Iterator<String> it = num.iterator(); it.hasNext();){
                int operator = Integer.parseInt(it.next());
                sum += operator;
            }*/
