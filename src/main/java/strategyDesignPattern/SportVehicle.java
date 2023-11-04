package strategyDesignPattern;

public class SportVehicle extends Vehicle{

    SportVehicle(){
        super(new SportStrategy());
    }
}
