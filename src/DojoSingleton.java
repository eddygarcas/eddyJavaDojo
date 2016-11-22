/**
 * Created by eddy on 11/18/16.
 */
public class DojoSingleton {

    private static DojoSingleton dojoSingleton;
    private static Integer instanceId;

    private DojoSingleton(Integer instanceid){
        instanceId = instanceid;
    }

    public static Integer getInstanceId() {
        return instanceId;
    }

    public static DojoSingleton initialize(){
        if (dojoSingleton == null)
            dojoSingleton = new DojoSingleton(1);
        return dojoSingleton;
    }

}
