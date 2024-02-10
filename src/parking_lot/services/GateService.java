package parking_lot.services;

import parking_lot.models.Gate;
import parking_lot.repositories.GateRepository;

import java.util.List;

public class GateService {
    private GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public void addNewGates(List<Gate> gateList) {
        for(Gate gate:gateList){
            gateRepository.addNewGate(gate);
        }
    }
}
