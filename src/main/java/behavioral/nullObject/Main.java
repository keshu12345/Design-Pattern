package behavioral.nullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicleObject("Bike");

        System.out.println("Seating Capacity : "+vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity : "+vehicle.getTankCapacity());
    }
}
