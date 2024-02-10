package OOPS.overloading;

public class Client {

    public static void main(String[] args) {
        A a = new A();

//        Compile time OOPS.polymorphism
//        Diff method signatures
        a.printHello();
        a.printHello("MB");

        a.scaler(12);
        Integer integer = Integer.valueOf(90);
        a.scaler(integer);
    }
}
