package State.StateTemplate;

public class ConcreteStateA implements State{
    @Override
    public void handle() {
        System.out.println("Handling operation in State A");
    }
}
