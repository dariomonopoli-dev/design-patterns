package Decorator.DecoratorTemplate;

public class Client {


    public static void main(String[] args) {

        Component concreteComp = new ConcreteComponent();
        System.out.println(concreteComp.methodA());

        concreteComp = new ConcreteDecoratorA(concreteComp);
        System.out.println(concreteComp.methodA());


    }
}
