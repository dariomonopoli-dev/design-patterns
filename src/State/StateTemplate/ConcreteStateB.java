package State.StateTemplate;

public class ConcreteStateB implements State{
    @Override
    public void handle() {
        System.out.println("Handling operation in State B");
    }
}
