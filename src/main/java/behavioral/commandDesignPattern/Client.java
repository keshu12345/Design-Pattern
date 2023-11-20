package behavioral.commandDesignPattern;

public class Client {
    public static void main(String[] args) {
        Reciever1 reciever1=new Reciever1();
        Command command1=new Command1(reciever1);
        Invoker invoker=new Invoker(command1);
        invoker.commandExecute();
    }

}
