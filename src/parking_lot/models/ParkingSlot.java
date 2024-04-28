package parking_lot.models;

public class ParkingSlot extends BaseClass{

    private VehicleType vehicleType;
    private ParkingStatus parkingStatus;
    private int parkingSlotNumber;
    private int floorId;

    public ParkingSlot(VehicleType vehicleType, ParkingStatus parkingStatus, int parkingSlotNumber, int floorId) {
        this.vehicleType = vehicleType;
        this.parkingStatus = parkingStatus;
        this.parkingSlotNumber = parkingSlotNumber;
        this.floorId = floorId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public int getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(int parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public int getFloor() {
        return floorId;
    }

    public void setFloor(int floorId) {
        this.floorId = floorId;
    }
}
