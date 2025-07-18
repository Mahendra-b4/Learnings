package ParkingLot.models;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloorList;
    private ParkingLotStatus parkingLotStatus;

    private static ParkingLot parkingLot;

    private ParkingLot() {
    }

    private ParkingLot(List<ParkingFloor> parkingFloorList, ParkingLotStatus parkingLotStatus) {
        this.parkingFloorList = parkingFloorList;
        this.parkingLotStatus = parkingLotStatus;
    }

    public static ParkingLot getInstance(List<ParkingFloor> parkingFloorList, ParkingLotStatus parkingLotStatus){
        if(parkingLot == null){
            synchronized (ParkingLot.class){
                if(parkingLot == null){
                    parkingLot = new ParkingLot(parkingFloorList, parkingLotStatus);
                }
            }
        }
        return parkingLot;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }
}
