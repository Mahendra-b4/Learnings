package OOPS.polymorphism;

public class Client {
    public static void main(String[] args) {
        A a = new C();

        a.changeName(a, "MB");
//        C c = new A();

        C c = new C();
        c.changeName(c, "Maha");
    }
}
