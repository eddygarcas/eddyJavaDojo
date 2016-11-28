import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by eddy on 11/28/16.
 */
public class UnitFizzBuzz {

    // Write a function in order to print all numbers from 1 to 100 using the following restrictions:
        //Print Fizz if the number is divisible by 3
        //Print Buzz if the number is disisible by 5
        //Print FizzBuzz if the number if divisible by 3 and 5
    //Extra requirements:
        //a number is Fizz if it's divisible by 3 or includes 3 as well.
        //a number is Buzz if it's divisible by 5 or includes 5 as well
        //Start building initial requirement and improve your code with extra requirements later on.

    private int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,35,53};//,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        fizzBuzz = new FizzBuzz("Fizz",3,"Buzz",5);
    }

    @Test
    public void testPrintFuzzOrBuzzIfNumersAreDivisibleByThreeOrFive() {
        Assert.assertEquals("1,2,Fizz,4,Buzz", fizzBuzz.process(Arrays.copyOfRange(numbers,0,5)));
    }

    @Test
    public void testPrintFuzzBuzzIfTheNumberIsDivisibleByThreeAndFive(){
        Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz", fizzBuzz.process(Arrays.copyOfRange(numbers,0,15)));
    }

    @Test
    public void testPrintFuzzBuzzIfTheNumberIsDivisibleByThreeAndFiveOrHasThreeOrFive(){
        Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz", fizzBuzz.process(Arrays.copyOfRange(numbers,0,15)));
    }

    @Test
    public void testPrintBuzzIfTheNumberContainsThreeAndFiveDueToDivisibleByFive(){
        Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz,Buzz", fizzBuzz.process(Arrays.copyOfRange(numbers,0,16)));
    }

    @Test
    public void testPrintFuzzBuzzIfTheNumberContainsThreeAndFive(){
        Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz,Buzz,FizzBuzz", fizzBuzz.process(Arrays.copyOfRange(numbers,0,17)));
    }
}
