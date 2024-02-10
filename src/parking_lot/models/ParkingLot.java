package parking_lot.models;

import parking_lot.strategies.allotment_strategy.ParkingLotAllotmentStrategy;
import parking_lot.strategies.billing_strategy.BillingStrategy;

import java.util.List;

public class ParkingLot extends BaseClass{
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private ParkingLotAllotmentStrategy parkingLotAllotmentStrategy;
    private BillingStrategy billingStrategy;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingLotAllotmentStrategy getParkingLotAllotmentStrategy() {
        return parkingLotAllotmentStrategy;
    }

    public void setParkingLotAllotmentStrategy(ParkingLotAllotmentStrategy parkingLotAllotmentStrategy) {
        this.parkingLotAllotmentStrategy = parkingLotAllotmentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
