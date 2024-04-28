package parking_lot.App;

import parking_lot.controllers.TicketController;
import parking_lot.dtos.IssueTicketRequest;
import parking_lot.models.*;
import parking_lot.repositories.GateRepository;
import parking_lot.repositories.ParkingLotRepository;
import parking_lot.repositories.TicketRepository;
import parking_lot.repositories.VehicleRepository;
import parking_lot.services.GateService;
import parking_lot.services.TicketService;
import parking_lot.strategies.allotment_strategy.ParkingLotAllotmentStrategy;
import parking_lot.strategies.allotment_strategy.ParkingLotAllotmentStrategyFactory;
import parking_lot.strategies.allotment_strategy.SimpleParkingSlotAllotStrategy;
import parking_lot.strategies.billing_strategy.BillingStrategy;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        List<Gate> gateList = new ArrayList<>();
        gateList.add(new Gate(GateType.ENTRY, 1, new Operator(123, "Ram"), GateStatus.ACTIVE));
        gateList.add(new Gate(GateType.EXIT, 2, new Operator(234, "Sam"), GateStatus.ACTIVE));
        GateService gateService = new GateService(gateRepository);
        gateService.addNewGates(gateList);

//        parkingLotRepository.
        List<ParkingSlot> firstFloorParkingSlots = new ArrayList<>();
        firstFloorParkingSlots.add(new ParkingSlot(VehicleType.TWO_WHEELER, ParkingStatus.EMPTY, 1, 1));
        firstFloorParkingSlots.add(new ParkingSlot(VehicleType.FOUR_WHEELER, ParkingStatus.EMPTY, 2, 1));

        List<ParkingSlot> secondFloorParkingSlots = new ArrayList<>();
        secondFloorParkingSlots.add(new ParkingSlot(VehicleType.TWO_WHEELER, ParkingStatus.EMPTY, 1, 2));
        secondFloorParkingSlots.add(new ParkingSlot(VehicleType.FOUR_WHEELER, ParkingStatus.EMPTY, 2, 2));

        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(new ParkingFloor(1,firstFloorParkingSlots));
        parkingFloors.add(new ParkingFloor(2, secondFloorParkingSlots));

        ParkingLotAllotmentStrategy parkingLotAllotmentStrategy = new SimpleParkingSlotAllotStrategy();
        BillingStrategy billingStrategy = new BillingStrategy();

        List<ParkingLot> parkingLotList = new ArrayList<>();
        parkingLotList.add(new ParkingLot(parkingFloors, gateList, ParkingLotStatus.ACTIVE,
                ParkingLotAllotmentStrategyFactory.getParkingLotAllotmentStrategyforType(parkingLotAllotmentStrategy),
                billingStrategy));

        parkingLotRepository.addNewParkingLot(parkingLotList);

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequest issueTicketRequest = new IssueTicketRequest();
        issueTicketRequest.setVehicleNumber("TS10FH3741");
        issueTicketRequest.setVehicleType(VehicleType.TWO_WHEELER);
        issueTicketRequest.setOwnerName("Mahendra");
        issueTicketRequest.setParkingLotId(1l);
        issueTicketRequest.setGateId(1l);


        ticketController.issueTicket(issueTicketRequest);


    }
}
