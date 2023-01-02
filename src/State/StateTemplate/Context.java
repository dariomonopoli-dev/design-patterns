package State.StateTemplate;

public class Context {
    State state;
    void setState(State state) {
        this.state = state;
    }
    public void request() {
        state.handle();
    }
}
