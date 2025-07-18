package ParkingLot.dtos;

import ParkingLot.models.Ticket;

public class IssueTicketResponse {
    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String message;

    public IssueTicketResponse(Ticket ticket, ResponseStatus responseStatus, String message) {
        this.ticket = ticket;
        this.responseStatus = responseStatus;
        this.message = message;
    }

    @Override
    public String toString() {
        return "IssueTicketResponse{" +
                "ticket=" + ticket.toString() +
                ", responseStatus=" + responseStatus.toString() +
                ", message='" + message + '\'' +
                '}';
    }
}
