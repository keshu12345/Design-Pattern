package behavioral.nullObject;

public class VehicleFactory {

    static Vehicle getVehicleObject(String name){

        if (name.equals("CAR")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
