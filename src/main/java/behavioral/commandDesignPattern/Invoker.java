package behavioral.commandDesignPattern;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void commandExecute() {
        command.execute();
    }
}
