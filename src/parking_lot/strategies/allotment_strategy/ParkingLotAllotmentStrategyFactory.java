package parking_lot.strategies.allotment_strategy;

public class ParkingLotAllotmentStrategyFactory {

    public static ParkingLotAllotmentStrategy getParkingLotAllotmentStrategyforType(
            ParkingLotAllotmentStrategy parkingLotAllotmentStrategy){
        return new SimpleParkingSlotAllotStrategy();
    }
}
