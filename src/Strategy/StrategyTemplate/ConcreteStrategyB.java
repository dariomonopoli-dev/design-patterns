package Strategy.StrategyTemplate;

public class ConcreteStrategyB implements AbstractStrategy{
    @Override
    public void doSomething() {
        System.out.println("Performing Strategy B");
    }
}
