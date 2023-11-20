package behavioral.commandDesignPattern.doUndo;

public class DoUndoCommand implements ICommand {

    private FileDoUndoReceiver fileDoUndoReceiver;

    public DoUndoCommand(FileDoUndoReceiver fileDoUndoReceiver) {
        this.fileDoUndoReceiver = fileDoUndoReceiver;
    }

    @Override
    public void execute() {
        fileDoUndoReceiver.DoAction();
    }

    @Override
    public void undo() {
        fileDoUndoReceiver.UndoAction();
    }
}
