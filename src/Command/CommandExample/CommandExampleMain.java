package Command.CommandExample;

public class CommandExampleMain {

    public static void main(String[] args) {

        LightReceiver l = new LightReceiver();
        Command lc = new LightCommand(l);

        GarageReceiver g = new GarageReceiver();
        Command gc = new GarageCommand(g);

        // moving on to the Executor of commands
        ExecutorInvoker e = new ExecutorInvoker();

        e.executeCommand(gc);
        e.executeCommand(lc);

        e.undoLastCommand();
        e.undoLastCommand();

        System.out.println("");

    }

}