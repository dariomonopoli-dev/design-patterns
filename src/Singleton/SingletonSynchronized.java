package Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance = null;


    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }

        return uniqueInstance;
    }
}
