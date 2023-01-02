package Command.CommandExample;

import java.util.Stack;

public class ExecutorInvoker {

    private Stack<Command> executedCommands = new Stack<Command>();

    public ExecutorInvoker() { }

    public void executeCommand(Command c) {
        c.execute();
        executedCommands.push(c);
    }

    public void undoLastCommand() {
        Command lastExecutedCommand = executedCommands.pop();
        System.out.println("I am going to UNDO your last command");
        lastExecutedCommand.undo();
    }


}
