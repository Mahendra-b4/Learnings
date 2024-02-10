package parking_lot.services;

import parking_lot.dtos.IssueTicketRequest;
import parking_lot.exceptions.GateNotFoundException;
import parking_lot.exceptions.NoParkingLotFoundException;
import parking_lot.exceptions.ParkingLotFullException;
import parking_lot.models.*;
import parking_lot.repositories.GateRepository;
import parking_lot.repositories.ParkingLotRepository;
import parking_lot.repositories.TicketRepository;
import parking_lot.repositories.VehicleRepository;
import parking_lot.strategies.allotment_strategy.ParkingLotAllotmentStrategy;
import parking_lot.strategies.allotment_strategy.ParkingLotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException, NoParkingLotFoundException, ParkingLotFullException {
        // Set Time
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        // 1. Get Gate details
        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId());
        ticket.setEntryGate(gate);

        // 2. Get Vehicle details \\ Add if vehicle is not present
        Vehicle vehicle = getVehicleForNumber(ticketRequest);
        ticket.setVehicle(vehicle);

        // 3. Get Parking Lot
        ParkingSlot parkingSlot = getParkingSlotForStratAndVehicleType(ticketRequest, vehicle);
        ticket.setParkingSlot(parkingSlot);

        // 4. Ticket Number
        ticket.setNumber(ticketRequest.getOwnerName()+UUID.randomUUID());

        return ticketRepository.save(ticket);
    }

    private ParkingSlot getParkingSlotForStratAndVehicleType(IssueTicketRequest ticketRequest, Vehicle vehicle) throws NoParkingLotFoundException, ParkingLotFullException {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(ticketRequest.getParkingLotId());
        ParkingLotAllotmentStrategy parkingLotAllotmentStrategy = parkingLot.getParkingLotAllotmentStrategy();
        ParkingLotAllotmentStrategy parkingLotAllotmentStratRule =
                ParkingLotAllotmentStrategyFactory.getParkingLotAllotmentStrategyforType(parkingLotAllotmentStrategy);
        ParkingSlot parkingSlot = parkingLotAllotmentStratRule.getParkingSlot(vehicle.getVehicleType(), parkingLot);
        return parkingSlot;
    }

    private Vehicle getVehicleForNumber(IssueTicketRequest ticketRequest) {
        Vehicle vehicle = vehicleRepository.findVehicleByVehicleNumber(ticketRequest.getVehicleNumber());
        if(vehicle == null){
             vehicle = new Vehicle(ticketRequest.getVehicleNumber(), ticketRequest.getVehicleType(), ticketRequest.getOwnerName());
             vehicleRepository.addNewVehicle(vehicle);
        }
        return vehicle;
    }
}
