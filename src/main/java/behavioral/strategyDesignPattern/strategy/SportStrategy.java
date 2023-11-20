package behavioral.strategyDesignPattern.strategy;

public class SportStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport drive strategy");
    }
}
