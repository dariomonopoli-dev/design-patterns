package Singleton;

public class SingletonNoThreadsPrevention {

    private static SingletonNoThreadsPrevention uniqueInstance = null;


    private SingletonNoThreadsPrevention() {}

    public static SingletonNoThreadsPrevention getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonNoThreadsPrevention();
        }

        return uniqueInstance;
    }
}
