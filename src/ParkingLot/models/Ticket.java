package ParkingLot.models;

import java.time.LocalDateTime;

public class Ticket {
    private int ticketNumber;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private ParkingSlot parkingSlot;
    private Operator operator;

    public Ticket(int ticketNumber, Vehicle vehicle, LocalDateTime entryDateTime, ParkingSlot parkingSlot, Operator operator) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.parkingSlot = parkingSlot;
        this.operator = operator;
    }

    public int getTicketNumber() {
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

    public Operator getOperator() {
        return operator;
    }
}
