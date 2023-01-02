package Flyweight.FlyweightTemplate;

import java.util.HashMap;

public class FlyweightFactory {


    private static FlyweightFactory uniqueInstance = new FlyweightFactory();
    private HashMap<String, Flyweight> flyweights = new HashMap<>();


    public static FlyweightFactory getInstance() {
        return uniqueInstance;
    }

    public Flyweight get(String key) {
        Flyweight f = null;
        if(flyweights.get(key) != null) {
            f = flyweights.get(key);
        } else {
            switch(key) {
                case "ConcreteFlyweight":
                    System.out.println("ConcreteFlyweight Created");
                    f = new ConcreteFlyweight();
                    break;
            }

            flyweights.put(key, f);
        }
        return f;
    }

}
