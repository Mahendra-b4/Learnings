package parking_lot.repositories;

import parking_lot.exceptions.GateNotFoundException;
import parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long, Gate> gateMap = new HashMap<>();
    private long previousId;
    public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if (gateMap.containsKey(gateId)) {
            return gateMap.get(gateId);
        }
        throw new GateNotFoundException();
    }

    public void addNewGate(Gate gate) {
        previousId++;
        gate.setId(previousId);
        gateMap.put(previousId,gate);
    }
}
