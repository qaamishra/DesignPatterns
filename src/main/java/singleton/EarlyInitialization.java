package singleton;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class EarlyInitialization {

    private static EarlyInitialization uniqueInstance = new EarlyInitialization();//When JVM loads it at the time itself the instance is ready

    private EarlyInitialization() {
    }

    public static EarlyInitialization getInstance() {
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }

}
