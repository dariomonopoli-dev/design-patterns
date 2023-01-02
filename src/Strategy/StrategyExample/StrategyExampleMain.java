package Strategy.StrategyExample;

public class StrategyExampleMain {

    public static void main(String[] args) {
        FlyBehaviour flyWithWings = new FlyWithWings();
        QuackBehaviour squeak = new Squeak();

        Duck mallardDuck = new MallardDuck(flyWithWings, null);
        Duck mallardDuck2 = new MallardDuck(null, squeak);

        mallardDuck.performFly();
        mallardDuck2.performQuack();


    }
}