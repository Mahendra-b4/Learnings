package parking_lot.App;

import parking_lot.controllers.TicketController;
import parking_lot.models.Gate;
import parking_lot.models.GateStatus;
import parking_lot.models.GateType;
import parking_lot.models.Operator;
import parking_lot.repositories.GateRepository;
import parking_lot.repositories.ParkingLotRepository;
import parking_lot.repositories.TicketRepository;
import parking_lot.repositories.VehicleRepository;
import parking_lot.services.GateService;
import parking_lot.services.TicketService;

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



        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
//        ticketController.issueTicket()


    }
}
