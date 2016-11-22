import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eddy on 11/21/16.
 */
public class UnitStringCalculator {

    /*
    # Requirements
    #Create a simple String calculator with a method int Add(string numbers)
    #The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
    #Allow the Add method to handle an unknown amount of numbers
    #Allow the Add method to handle new lines between numbers (instead of commas).
    #    The following input is ok: “1\n2,3” (will equal 6)
    #Support different delimiters
    #To change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
    #The first line is optional. All existing scenarios should still be supported
    #Calling Add with a negative number will throw an exception “negatives not allowed” – and the negative that was passed. If there are multiple negatives, show all of them in the exception message stop here if you are a beginner.
    #Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
    #Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[—]\n1—2—3” should return 6
    #Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[-][%]\n1-2%3” should return 6.
    #Make sure you can also handle multiple delimiters with length longer than one char
     */

    StringCalculator stringCalculator;

    @Before
    public void before() {
        stringCalculator = new StringCalculator("Sum numbers on a string");
    }

    @Test
    public void testUseAMethodAddToSumNumbersPassedOnASingleStringLine() {
        Assert.assertEquals(0, stringCalculator.add(""));

    }
    @Test
    public void testAStringWhichContainsNumbersToSum1() {
        Assert.assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void testAStringWhichContainsNumbersToSum3() {
        Assert.assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void testAddMethodShouldHandleNewlinesAsPartOfTheInputString() {
        Assert.assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    @Test
    public void testNumberSeparatorIsExpressedByParalelBars() {
        Assert.assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test(expected = NumberFormatException.class)
    public void testNegativeNumbersShouldThrownAnExcpetion(){
        stringCalculator.add("//;\n-1;-2;-34,-56,345,1023");
    }
    @Test
    public void testSumLargerNumberOfElementsUsingDiferentDelimiters() {
       Assert.assertEquals(1461 , stringCalculator.add("//;\n1;2;34.56/345%1023"));
    }

}
