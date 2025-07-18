package ParkingLot.models;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketNumber;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private ParkingSlot parkingSlot;

    public Ticket(String ticketNumber, Vehicle vehicle, LocalDateTime entryDateTime, ParkingSlot parkingSlot) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.parkingSlot = parkingSlot;
    }

    public Ticket() {

    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", vehicle=" + vehicle.toString() +
                ", entryTime=" + entryTime +
                ", parkingSlot=" + parkingSlot.toString() +
                '}';
    }
}
