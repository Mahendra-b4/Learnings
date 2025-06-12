package OOPS.abstraction;

public class Car extends Vehicle {
    private int price;

    Car(String brand, int year, int price){
        super(brand, year);
        this.price = price;
    }
    @Override
    public void drive() {
        System.out.println("Driving ");
    }
}
