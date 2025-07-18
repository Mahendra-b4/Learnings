package ParkingLot.controllers;

import ParkingLot.models.*;
import ParkingLot.repositories.ParkingRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.ParkingService;
import ParkingLot.services.TicketService;
import ParkingLot.stratagies.parkingStratagies.SimpleVehicleParkingStrategy;
import ParkingLot.stratagies.parkingStratagies.VehicleParkingStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingController {

    public static void main(String[] args) {
        ParkingRepository parkingRepository = new ParkingRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        List<ParkingSlot> firstFloorParkingSlots = new ArrayList<>();
        firstFloorParkingSlots.add(new ParkingSlot(1, VehicleType.BIKE, 1, ParkingSlotStatus.AVAILABLE));
        firstFloorParkingSlots.add(new ParkingSlot(2, VehicleType.CAR, 1, ParkingSlotStatus.AVAILABLE));

        List<ParkingSlot> secondFloorParkingSlots = new ArrayList<>();
        secondFloorParkingSlots.add(new ParkingSlot(1, VehicleType.BIKE, 2, ParkingSlotStatus.AVAILABLE));
        secondFloorParkingSlots.add(new ParkingSlot(1, VehicleType.CAR, 2, ParkingSlotStatus.AVAILABLE));

        parkingFloorList.add(new ParkingFloor(1, firstFloorParkingSlots));
        parkingFloorList.add(new ParkingFloor(2, secondFloorParkingSlots));

        parkingRepository.setParkingFloorList(parkingFloorList);

        VehicleParkingStrategy vehicleParkingStrategy = new SimpleVehicleParkingStrategy();

        ParkingLot parkingLot = ParkingLot.getInstance(parkingFloorList, ParkingLotStatus.OPERATIONAL);

        TicketService ticketService = new TicketService(vehicleRepository, parkingRepository, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        ParkingService parkingService = new ParkingService(parkingRepository, ticketController, parkingLot);


        while(parkingLot.getParkingLotStatus().equals(ParkingLotStatus.OPERATIONAL)){
            parkingService.parkVehicle();
        }

    }
}
