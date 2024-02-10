package OOPS.overriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomeThing();

        a = new B();
        a.doSomeThing();

        a = new C();
        a.doSomeThing();
    }
}
