package Decorator.DecoratorTemplate;

public class ConcreteDecoratorB extends Decorator{

    Component component;

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    @Override
    public String methodA() {
        return component.methodA() + " with decoration B";

    }

    @Override
    public String methodB() {

        return component.methodA() + " with decoration B";

    }

}
