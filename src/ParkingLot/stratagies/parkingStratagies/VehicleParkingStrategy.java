package ParkingLot.stratagies.parkingStratagies;

import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.ParkingRepository;

public interface VehicleParkingStrategy {
    public ParkingSlot getParkingSlot(VehicleType vehicleType, ParkingRepository parkingRepository);
}
