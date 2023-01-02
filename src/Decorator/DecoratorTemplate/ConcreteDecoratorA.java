package Decorator.DecoratorTemplate;

public class ConcreteDecoratorA extends Decorator{

    Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public String methodA() {
        return component.methodA() + " with decoration A";

    }

    @Override
    public String methodB() {

        return component.methodA() + " with decoration A";

    }

    public void newBehavior() {

    }
}
