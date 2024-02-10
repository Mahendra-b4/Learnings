package parking_lot.repositories;

import parking_lot.exceptions.NoParkingLotFoundException;
import parking_lot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot getParkingLotById(Long parkingLotId) throws NoParkingLotFoundException {
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.get(parkingLotId);
        }
        throw new NoParkingLotFoundException();
    }
}
