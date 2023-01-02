package State.StateExample;

public class StateExampleMain {

    public static void main(String[] args) {
        GumballMachine gbm = new GumballMachine();
        gbm.setState(new NoQuarterState());
        gbm.turnCrank();
        gbm.setState(new SoldOutState());
        gbm.turnCrank();

    }
}
