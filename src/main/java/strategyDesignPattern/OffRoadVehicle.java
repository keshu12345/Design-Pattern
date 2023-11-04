package strategyDesignPattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportStrategy());
    }
}
