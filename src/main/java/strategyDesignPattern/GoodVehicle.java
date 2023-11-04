package strategyDesignPattern;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){
        super(new NormalStrategy());
    }

}
