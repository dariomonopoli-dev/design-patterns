package Flyweight.FlyweightTemplate;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory aFactory = new FlyweightFactory();
        Flyweight flyweight1 = aFactory.get("ConcreteFlyweight");
        flyweight1.operation("plus some Extrinstic State");

    }

}
