package behavioral.strategyDesignPattern;

import behavioral.strategyDesignPattern.strategy.SportStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportStrategy());
    }
}
