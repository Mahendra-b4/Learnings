package Design_Patterns.singleton.DoubleCheckLocking;

public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(String.valueOf(DatabaseConnection.getInstance()));
        Thread t2 = new Thread(String.valueOf(DatabaseConnection.getInstance()));
        t1.start();
        System.out.println(t1.getId());
        t2.start();
        System.out.println(t2.getId());
    }
}
