package ParkingLot.repositories;

import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<String, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public IssueTicketResponse save(Ticket ticket) {
        ticketMap.put(ticket.getTicketNumber(), ticket);
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, "Ticket created and saved");
    }
}
