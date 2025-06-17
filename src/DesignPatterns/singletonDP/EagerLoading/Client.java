package DesignPatterns.singletonDP.EagerLoading;

public class Client {

    public static void main(String[] args) {
        Laptop laptop1 = Laptop.getInstance();
        System.out.println(laptop1.hashCode());

        Laptop laptop2 = Laptop.getInstance();
        System.out.println(laptop2.hashCode());

//        Laptop laptop = new Laptop();
    }
}
