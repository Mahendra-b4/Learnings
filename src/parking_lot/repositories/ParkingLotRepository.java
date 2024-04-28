package parking_lot.repositories;

import parking_lot.exceptions.NoParkingLotFoundException;
import parking_lot.models.Gate;
import parking_lot.models.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();

    Long previousId = 0l;
    public ParkingLot getParkingLotById(Long parkingLotId) throws NoParkingLotFoundException {
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.get(parkingLotId);
        }
        throw new NoParkingLotFoundException();
    }

    public void addNewParkingLot(List<ParkingLot> parkingLots) {
        for(ParkingLot parkingLot:parkingLots) {
            previousId++;
            parkingLot.setId(previousId);
            parkingLotMap.put(previousId, parkingLot);
        }
    }
}
