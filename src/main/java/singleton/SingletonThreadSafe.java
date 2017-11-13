package singleton;

public class SingletonThreadSafe {
	private static SingletonThreadSafe uniqueInstance;
 
	// other useful instance variables here
 
	private SingletonThreadSafe() {}
 
	public static synchronized SingletonThreadSafe getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonThreadSafe();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
