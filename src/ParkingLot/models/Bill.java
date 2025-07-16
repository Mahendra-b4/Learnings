package ParkingLot.models;

import java.time.LocalDateTime;

public class Bill {

    private int billId;
    private Ticket ticket;
    private Operator operator;
    private LocalDateTime exitTime;
    private Float amount;
    private BillingStatus billingStatus;

}
