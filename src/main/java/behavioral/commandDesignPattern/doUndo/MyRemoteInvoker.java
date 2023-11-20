package behavioral.commandDesignPattern.doUndo;

import java.util.Stack;

public class MyRemoteInvoker {
    Stack<ICommand>asCommandHistory=new Stack<>();
    private ICommand command;

    public MyRemoteInvoker() {
    }

    public void setCommand(ICommand iCommand){
        this.command=iCommand;
    }

    public void writeOnTextEditor(){
        command.execute();
        asCommandHistory.push(command);
    }

    public void pressControlZ(){

        if(!asCommandHistory.isEmpty()){
            ICommand lastCommand=asCommandHistory.pop();
            command.undo();
        }


    }


}
