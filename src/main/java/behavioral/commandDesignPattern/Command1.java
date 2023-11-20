package behavioral.commandDesignPattern;

public class Command1 implements Command{

    Reciever1 reciever1;

    public Command1(Reciever1 reciever1) {
        this.reciever1 = reciever1;
    }

    @Override
    public void execute() {
      reciever1.action1();
    }
}
