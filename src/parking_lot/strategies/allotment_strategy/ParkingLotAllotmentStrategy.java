package parking_lot.strategies.allotment_strategy;

import parking_lot.exceptions.ParkingLotFullException;
import parking_lot.models.ParkingLot;
import parking_lot.models.ParkingSlot;
import parking_lot.models.VehicleType;

public interface ParkingLotAllotmentStrategy {

    ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingLot parkingLot)
            throws ParkingLotFullException;
}
