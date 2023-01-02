package Command.CommandTemplate;

import java.util.Stack;

public class Invoker {

    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        commandHistory.push(command);
        command.execute();
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }

}
