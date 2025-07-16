package ParkingLot.models;

import java.util.List;

public class ParkingFloor {
    private int parkingFloorNumber;
    private List<ParkingSlot> parkingSlotList;

    public ParkingFloor(int parkingFloorNumber, List<ParkingSlot> parkingSlotList) {
        this.parkingFloorNumber = parkingFloorNumber;
        this.parkingSlotList = parkingSlotList;
    }

    public int getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }
}
