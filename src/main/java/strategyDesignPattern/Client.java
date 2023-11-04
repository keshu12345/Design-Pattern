package strategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        vehicle=new GoodVehicle();
        vehicle.drive();
    }
}
