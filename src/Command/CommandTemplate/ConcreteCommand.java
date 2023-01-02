package Command.CommandTemplate;

import Command.CommandExample.GarageReceiver;

public class ConcreteCommand implements Command{


    private final Receiver receiver;

    public ConcreteCommand(Receiver aReceiver) {
        receiver = aReceiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.undoAction();
    }
}
