package ParkingLot.services;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequest;
import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.models.*;
import ParkingLot.repositories.ParkingRepository;
import ParkingLot.stratagies.parkingStratagies.SimpleVehicleParkingStrategy;
import ParkingLot.stratagies.parkingStratagies.VehicleParkingStrategy;

import java.util.Scanner;

public class ParkingService {
    private Scanner scanner;
    private ParkingRepository parkingRepository;
    private VehicleParkingStrategy vehicleParkingStrategy;
    private TicketController ticketController;
    private ParkingLot parkingLot;

    public ParkingService(ParkingRepository parkingRepository, TicketController ticketController, ParkingLot parkingLot) {
        scanner = new Scanner(System.in);
        vehicleParkingStrategy = new SimpleVehicleParkingStrategy();
        this.parkingRepository = parkingRepository;
        this.ticketController = ticketController;
        this.parkingLot = parkingLot;
    }

    public void parkVehicle() {

        System.out.println("Enter vehicle details as below:");
        System.out.println("Enter vehicle number:");
        String vehicleNumber = scanner.next();
        System.out.println("Enter vehicle owner name:");
        String vehicleOwnerName = scanner.next();
        System.out.println("Enter vehicle owner number:");
        String vehicleOwnerNumber = scanner.next();
        System.out.println("is it BIKE or CAR");
        String vehicleType = scanner.next();

        VehicleType vehicleType1 = getVehicleType(vehicleType);

        ParkingSlot parkingSlot = getParkingSlot(vehicleType1);

        if(parkingSlot == null){
            parkingLot.setParkingLotStatus(ParkingLotStatus.FULL);
            System.out.println("No Parking Slots available for "+vehicleType);
        }
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.OCCUPIED);
        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleOwnerName, vehicleOwnerNumber, vehicleType1);
        IssueTicketRequest issueTicketRequest = new IssueTicketRequest(vehicle, parkingSlot);
        IssueTicketResponse issueTicketResponse = ticketController.issueTicket(issueTicketRequest);

        System.out.println(issueTicketResponse.toString());

    }

    private ParkingSlot getParkingSlot(VehicleType vehicleType1) {
        return vehicleParkingStrategy.getParkingSlot(vehicleType1, parkingRepository);
    }

    private VehicleType getVehicleType(String vehicleType) {
        vehicleType = vehicleType.toUpperCase();
        if(vehicleType.matches("BIKE"))
            return VehicleType.BIKE;
        return VehicleType.CAR;
    }
}
