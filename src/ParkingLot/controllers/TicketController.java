package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequest;
import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest) {
        return ticketService.issueTicket(issueTicketRequest);
    }
}
