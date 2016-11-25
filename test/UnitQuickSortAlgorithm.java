import org.junit.Before;
import org.junit.Test;

/**
 * Created by eddy on 11/25/16.
 */
public class UnitQuickSortAlgorithm {

    QuickSortAlgorithm quicksort;

    @Before
    public void before(){
        quicksort = new QuickSortAlgorithm();

    }

    @Test
    public void testQuickSortAlgorithm(){
        quicksort.quicksort(new int[]{1,4,23,6,8,9,26},0,6);
    }

}
