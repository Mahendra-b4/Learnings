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

    public void setParkingSlotId(int parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setFloorId(int floorId) {
        FloorId = floorId;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
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

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "parkingSlotId=" + parkingSlotId +
                "floorId="+ FloorId+
                "parkingSlotStatus="+ parkingSlotStatus.toString()+
                '}';
    }
}
