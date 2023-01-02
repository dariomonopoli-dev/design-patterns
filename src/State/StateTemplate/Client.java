package State.StateTemplate;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request();
    }
}
