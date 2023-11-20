package behavioral.strategyDesignPattern;

import behavioral.strategyDesignPattern.strategy.NormalStrategy;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){
        super(new NormalStrategy());
    }

}
