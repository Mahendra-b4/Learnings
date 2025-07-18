package ParkingLot.services;

import ParkingLot.dtos.IssueTicketRequest;
import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.models.Ticket;
import ParkingLot.repositories.ParkingRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketService {
    private VehicleRepository vehicleRepository;
    private ParkingRepository parkingRepository;
    private TicketRepository ticketRepository;
    public TicketService(VehicleRepository vehicleRepository, ParkingRepository parkingRepository, TicketRepository ticketRepository) {
        this.vehicleRepository = vehicleRepository;
        this.parkingRepository = parkingRepository;
        this.ticketRepository = ticketRepository;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest) {
        Ticket ticket = new Ticket();

//        1. Set Date
        LocalDateTime entrydate = LocalDateTime.now();
        ticket.setEntryTime(entrydate);

//        2. Generate Ticket Number
        ticket.setTicketNumber(String.valueOf(UUID.randomUUID()));

//        3. Set vehicle
        ticket.setVehicle(issueTicketRequest.getVehicle());

//        4. Set Parking Slot
        ticket.setParkingSlot(issueTicketRequest.getParkingSlot());

        vehicleRepository.save(issueTicketRequest.getVehicle());

        return ticketRepository.save(ticket);
    }
}
