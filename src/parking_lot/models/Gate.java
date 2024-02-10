package parking_lot.models;

public class Gate extends BaseClass{

    private GateType gateType;
    private int GateNumber;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(GateType gateType, int gateNumber, Operator operator, GateStatus gateStatus) {
        this.gateType = gateType;
        GateNumber = gateNumber;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return GateNumber;
    }

    public void setGateNumber(int gateNumber) {
        GateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
