package OOPS.abstraction;

import java.sql.SQLOutput;

public abstract class Vehicle {
    private String brand;
    private int year;

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }

    public abstract void drive();

    public void displayInfo(){
        System.out.println("Brand = \""+ brand + "\" year = "+year);
    }

    public void beepHorn(){
        System.out.println("Vehicle beeping...");
    }
}
