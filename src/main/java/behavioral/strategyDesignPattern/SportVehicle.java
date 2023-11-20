package behavioral.strategyDesignPattern;

import behavioral.strategyDesignPattern.strategy.SportStrategy;

public class SportVehicle extends Vehicle{

    SportVehicle(){
        super(new SportStrategy());
    }
}
