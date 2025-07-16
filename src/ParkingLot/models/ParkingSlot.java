package ParkingLot.models;

public class ParkingSlot {
    private int parkingSlotId;
    private VehicleType vehicleType;
    private int FloorId;
    private ParkingSlotStatus parkingSlotStatus;

    public ParkingSlot(int parkingSlotId, VehicleType vehicleType, int floorId, ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotId = parkingSlotId;
        this.vehicleType = vehicleType;
        FloorId = floorId;
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public int getParkingSlotId() {
        return parkingSlotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getFloorId() {
        return FloorId;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }
}
