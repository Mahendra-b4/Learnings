package ParkingLot.models;

public class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String ownerNumber;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String ownerNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.ownerNumber = ownerNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerNumber='" + ownerNumber + '\'' +
                ", vehicleType=" + vehicleType.toString() +
                '}';
    }
}
