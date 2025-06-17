package DesignPatterns.singletonDP.EagerLoading;

public class Laptop {

    private Laptop(){}

    public static Laptop laptop = new Laptop();

    public static Laptop getInstance(){
        return laptop;
    }

}
