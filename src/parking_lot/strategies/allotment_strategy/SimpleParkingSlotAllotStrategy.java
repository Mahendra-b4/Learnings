package parking_lot.strategies.allotment_strategy;

import parking_lot.exceptions.ParkingLotFullException;
import parking_lot.models.*;
import parking_lot.repositories.ParkingLotRepository;

import java.util.List;

public class SimpleParkingSlotAllotStrategy implements ParkingLotAllotmentStrategy{

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingLotFullException {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        for(ParkingFloor parkingFloor:parkingFloors){
            List<ParkingSlot> parkingSlotList = parkingFloor.getParkingSlot();
            for(ParkingSlot parkingSlot:parkingSlotList){
                if(parkingSlot.getParkingStatus().equals(ParkingStatus.EMPTY) && parkingSlot.getVehicleType().equals(vehicleType)){
                    return parkingSlot;
                }
            }
        }
        throw new ParkingLotFullException();
    }
}
