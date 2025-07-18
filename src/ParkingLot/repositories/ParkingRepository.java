package ParkingLot.repositories;

import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingRepository {

    List<ParkingFloor> parkingFloorList = new ArrayList<>();

    public void setParkingFloorList(List<ParkingFloor> parkingFloors){
        this.parkingFloorList = parkingFloors;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public ParkingSlot getParkingSlotByVehicleType(VehicleType vehicleType) {

        return null;
    }
}
