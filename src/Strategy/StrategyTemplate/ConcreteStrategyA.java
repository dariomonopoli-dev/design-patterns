package Strategy.StrategyTemplate;

public class ConcreteStrategyA implements AbstractStrategy{
    @Override
    public void doSomething() {
        System.out.println("Performing Strategy A");
    }
}
