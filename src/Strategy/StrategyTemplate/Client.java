package Strategy.StrategyTemplate;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.performSomething();

        context.setStrategy(new ConcreteStrategyB());
        context.performSomething();
    }
}
