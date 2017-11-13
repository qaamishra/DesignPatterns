package singleton;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class LazyInitialization {

    private static LazyInitialization uniqueInstance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyInitialization(); //If we never Need the instance it never gets created so its called as Lazy
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }

}
