package parking_lot.models;

public class Operator extends BaseClass{
    private int empId;
    private String operatorName;

    public Operator(int empId, String operatorName) {
        this.empId = empId;
        this.operatorName = operatorName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
