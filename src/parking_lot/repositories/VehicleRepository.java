package parking_lot.repositories;

import parking_lot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {

    Map<String, Vehicle> vehicleMap = new HashMap<>();
    private long previousId = 0;
    public Vehicle findVehicleByVehicleNumber(String vehicleNumber) {
        if (vehicleMap.containsKey(vehicleNumber)) {
            return vehicleMap.get(vehicleNumber);
        }
        return null;
    }

    public void addNewVehicle(Vehicle vehicle) {
        previousId++;
        vehicle.setId(previousId);
        vehicleMap.put(vehicle.getVehicleNumber(), vehicle);
    }
}
