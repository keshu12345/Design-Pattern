package behavioral.strategyDesignPattern.strategy;

public class NormalStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving Strategy");
    }
}
