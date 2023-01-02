package Decorator.DecoratorTemplate;

public class ConcreteComponent extends Component{
    @Override
    public String methodA() {
        return "A component in method A";

    }

    @Override
    public String methodB() {
        return "A component in method B";
    }
}
