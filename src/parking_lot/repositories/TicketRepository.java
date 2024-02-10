package parking_lot.repositories;

import parking_lot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<Long, Ticket> ticketMap = new HashMap<>();
    long previousId = 0;
    public Ticket save(Ticket ticket) {
        previousId++;
        ticket.setId(previousId);
        ticketMap.putIfAbsent(previousId, ticket);
        return ticket;
    }
}
