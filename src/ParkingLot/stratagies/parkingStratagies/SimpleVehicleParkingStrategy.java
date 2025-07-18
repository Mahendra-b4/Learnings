package ParkingLot.stratagies.parkingStratagies;

import ParkingLot.models.ParkingFloor;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.ParkingSlotStatus;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.ParkingRepository;

import java.util.List;

public class SimpleVehicleParkingStrategy implements VehicleParkingStrategy{

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingRepository parkingRepository) {
        ParkingSlot parkingSlot = null;
//        parkingSlot = parkingRepository.getParkingSlotByVehicleType(vehicleType);
        List<ParkingFloor> parkingFloorList = parkingRepository.getParkingFloorList();
        for(ParkingFloor parkingFloor:parkingFloorList){
            for(ParkingSlot parkingSlot1: parkingFloor.getParkingSlotList()){
                if(parkingSlot1.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                        && parkingSlot1.getVehicleType().equals(vehicleType)){
                    parkingSlot = parkingSlot1;
                    break;
                }
            }
        }
        return parkingSlot;

    }
}
