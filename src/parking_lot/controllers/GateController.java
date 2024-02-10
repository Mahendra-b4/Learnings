package parking_lot.controllers;

import parking_lot.models.Gate;
import parking_lot.services.GateService;

import java.util.List;

public class GateController {

    private GateService gateService;

    public GateController(GateService gateService) {
        this.gateService = gateService;
    }

    public void addGates(List<Gate> gateList){
        gateService.addNewGates(gateList);
    }

}
