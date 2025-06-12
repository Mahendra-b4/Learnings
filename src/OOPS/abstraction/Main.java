package OOPS.abstraction;

public class Main {

    public static void main(String[] args) {
        Vehicle Skoda = new Car("Skoda", 2025, 100000);

        Skoda.beepHorn();
        Skoda.displayInfo();
        Skoda.drive();

    }
}
