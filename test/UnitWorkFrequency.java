import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by amiga600 on 11/25/16.
 */
/*
Requirements:
    Method to count total of words in a string
    Whitespace are not considered words
    Anything other than words (,./') etc will not be considered as words
    Count same words also
    Contraction words will be consider one word
    Count separatelly as many times as a word is contained in a string
*/

public class UnitWorkFrequency {

    WordFrequency wordFrequency;

    private static String LINE = "El, /.''#;[# perro //de mi hermana tiene pulgas, tiene pulgas...";

    private static String VERBUM = "pulgas";

    @Before
    public void before(){
        wordFrequency = new WordFrequency();
    }

    @Test
    public void testEmptyLineReturnCountAsZero() {
        Assert.assertEquals(0, wordFrequency.count(""));
    }

    @Test
    public void testCountNumberOfWordsInALineSeparatedByWhiteSpaces() {
        Assert.assertEquals(7, wordFrequency.count(LINE));
    }

    @Test
    public void testSameWordWillBeCountedAsOne() {
        Assert.assertEquals(7, wordFrequency.count(LINE));
    }

    @Test
    public void testCountHowManyTimesAWordIsContainedInAString() {
        Assert.assertEquals(7, wordFrequency.count(LINE,VERBUM));
    }

}
