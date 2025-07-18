package ParkingLot.dtos;

import ParkingLot.models.ParkingSlot;
import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

public class IssueTicketRequest {
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;

    public IssueTicketRequest(Vehicle vehicle, ParkingSlot parkingSlot) {
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}
