package parking_lot.controllers;

import parking_lot.dtos.IssueTicketRequest;
import parking_lot.dtos.IssueTicketResponse;
import parking_lot.dtos.ResponseStatus;
import parking_lot.exceptions.GateNotFoundException;
import parking_lot.exceptions.NoParkingLotFoundException;
import parking_lot.exceptions.ParkingLotFullException;
import parking_lot.models.Ticket;
import parking_lot.services.TicketService;

public class TicketController {

    public static String TICKET_ISSUE_MESSAGE = "Ticket Issue Successful!!";
    public static String INVALID_GATE = "Invalid Gate ID";
    public static String INVALID_PARKINGlOT = "Invalid ParkingLot ID";
    public static String PARKINGLOT_FULL = "ParkingLot is full";
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest) {
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(ticketRequest);
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, INVALID_GATE);
        } catch (NoParkingLotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, INVALID_PARKINGlOT);
        } catch (ParkingLotFullException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, PARKINGLOT_FULL);
        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUE_MESSAGE);
    }
}
