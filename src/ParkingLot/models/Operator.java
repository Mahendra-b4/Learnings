package ParkingLot.models;

public class Operator {
    private String name;
    private int id;

    public Operator(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
