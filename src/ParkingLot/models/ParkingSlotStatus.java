package ParkingLot.models;

public enum ParkingSlotStatus {
    OCCUPIED, AVAILABLE, RESERVED;

    @Override
    public String toString() {
        return "ParkingSlotStatus{}";
    }
}
