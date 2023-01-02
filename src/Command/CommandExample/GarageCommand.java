package Command.CommandExample;

public class GarageCommand implements Command {

    private final GarageReceiver myGarageReceiver;

    public GarageCommand(GarageReceiver garageReceiver) {
        myGarageReceiver = garageReceiver;
    }

    @Override
    public void execute() {
        myGarageReceiver.openDoor();
    }

    @Override
    public void undo() {
        myGarageReceiver.closeDoor();
    }
}
