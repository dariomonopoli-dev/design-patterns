package Singleton;

public class SingletonDoubleChecked {
        private volatile static SingletonDoubleChecked uniqueInstance;

        private SingletonDoubleChecked() {
        }

        public static SingletonDoubleChecked getInstance() {
            if (uniqueInstance == null) {
                synchronized (SingletonDoubleChecked.class) {
                    if (uniqueInstance == null) {
                        uniqueInstance = new SingletonDoubleChecked();
                    }
                }
            }
            return uniqueInstance;
        }
    }

