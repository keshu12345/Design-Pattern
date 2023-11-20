package behavioral.commandDesignPattern.doUndo;

public class Main {
    public static void main(String[] args) {
        FileDoUndoReceiver fileDoUndoReceiver=new FileDoUndoReceiver();
        ICommand command=new DoUndoCommand(fileDoUndoReceiver);
        MyRemoteInvoker myRemoteInvoker=new MyRemoteInvoker();
        myRemoteInvoker.setCommand(command);
        myRemoteInvoker.writeOnTextEditor();
        myRemoteInvoker.pressControlZ();
    }
}
