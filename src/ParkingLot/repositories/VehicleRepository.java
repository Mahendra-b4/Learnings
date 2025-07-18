package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {

    Map<String, Vehicle> vehicleMap;

    public VehicleRepository(){
        this.vehicleMap = new HashMap<>();
    }
    public void save(Vehicle vehicle) {
        vehicleMap.put(vehicle.getVehicleNumber(), vehicle);
    }
}
