import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by eddy on 11/25/16.
 */
public class FizzBuzz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";

    private static String THREE = "3";
    private static String FIVE = "5";

    private FizzBuzz(){
    }

    public FizzBuzz(String fizz,int numberFizz,String buzz, int numberBuzz) {
        FIZZ = fizz;
        THREE = String.valueOf(numberFizz);

        BUZZ = buzz;
        FIVE = String.valueOf(numberBuzz);
    }

    public String process(int[] numbers) {
        StringBuffer line = new StringBuffer();
        boolean first = true;

        for (int num : numbers) {

            if (!first) line.append(",");

            if (!divisible(num,line))
                if (!contains(num,line))
                    line.append(num);

            first = false;

        }
        return line.toString();
    }

    protected boolean divisible(int number, StringBuffer line) {
        boolean flag = false;

        if (divisibleBy(number,3)) {
            line.append(FIZZ);
            flag = true;
        }
        if (divisibleBy(number,5)) {
            line.append(BUZZ);
            flag = true;
        }
        return flag;
    }

    protected boolean contains (int number, StringBuffer line) {
        boolean flag = false;

        if (contains(number,THREE)){
            line.append(FIZZ);
            flag = true;
        }
        if (contains(number,FIVE)) {
            line.append(BUZZ);
            flag = true;
        }

        return flag;
    }

    private  boolean divisibleBy(int number, int divisor) {
        final int result = number % divisor;
        return result == 0;
    }

    private  boolean contains(int number, String search) {
        return String.valueOf(number).contains(search.subSequence(0,search.length()));

    }
}
