package behavioral.commandDesignPattern.doUndo;

public interface ICommand {
    public void execute();

    public void undo();
}
