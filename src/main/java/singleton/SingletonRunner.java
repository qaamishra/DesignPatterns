package singleton;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class SingletonRunner {

    public static void main(String[] args) {

        EarlyInitialization earlyInitialization;
        LazyInitialization lazyInitialization;
        SingletonThreadSafe singletonThreadSafe;

        //Ofcourse it wont work ,remember the private constructor ?
        //earlyInitialization=new EarlyInitialization();
        //lazyInitialization=new LazyInitialization();
        //singletonThreadSafe=new SingletonThreadSafe();

        earlyInitialization = EarlyInitialization.getInstance();
        System.out.println(earlyInitialization.getDescription());

        lazyInitialization=LazyInitialization.getInstance();
        System.out.println(lazyInitialization.getDescription());

        singletonThreadSafe=SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe.getDescription());

    }
}
