package State.StateExample;

public class GumballMachine {
    State state;
    void setState(State state) {
        this.state = state;
    }
    public void insertQuarter() {
        state.insertQuarter(); }
    public void ejectQuarter() {
        state.ejectQuarter(); }
    public void turnCrank() {
        state.turnCrank();
        state.dispense(); }

}
