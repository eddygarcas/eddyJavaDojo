import org.junit.Assert;
import org.junit.Test;

/**
 * Created by eddy on 11/18/16.
 */
public class UnitDojoSingleton {

    @Test
    public void testDojoSingleton(){
        Assert.assertNotNull(DojoSingleton.initialize());
        Assert.assertEquals(DojoSingleton.getInstanceId(),new Integer(1));
        Assert.assertNotNull(DojoSingleton.initialize());
        Assert.assertEquals(DojoSingleton.getInstanceId(),new Integer(1));
    }

}
