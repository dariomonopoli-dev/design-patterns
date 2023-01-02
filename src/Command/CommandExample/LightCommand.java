package Command.CommandExample;

public class LightCommand implements Command {

    public final LightReceiver myLightReceiver;

    public LightCommand(LightReceiver l) {
        myLightReceiver = l;
    }

    @Override
    public void execute() {
        myLightReceiver.turnLightOnAction();
    }

    @Override
    public void undo() {
        myLightReceiver.turnLightOffAction();
    }
}
