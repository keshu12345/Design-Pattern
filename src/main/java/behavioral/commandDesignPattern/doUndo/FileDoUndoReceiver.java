package behavioral.commandDesignPattern.doUndo;

public class FileDoUndoReceiver {
    boolean isDo;

    public void DoAction() {
        isDo = true;
        System.out.println(" We are writing on file : DO ");
    }

    public void UndoAction() {
        isDo = false;
        System.out.println(" Written in text file is undoing : UNDO ");
    }

}
