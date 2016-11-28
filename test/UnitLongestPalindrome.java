import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eddy on 11/28/16.
 */
public class UnitLongestPalindrome {

    private static String STR = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";

    @Before
    public void before(){
    }

    @Test
    public void testFindTheLongestPalindrome() {
        Assert.assertEquals("12345678987654321", LongestPalindrome.getLongestPalindrome(STR));
    }
}
