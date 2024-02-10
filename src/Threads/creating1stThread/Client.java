package Threads.creating1stThread;

public class Client {
    public static void main(String[] args) {
        System.out.println("From main : " + Thread.currentThread().getName());
        HelloWorldTaskThread hwTask = new HelloWorldTaskThread();
        Thread t1 = new Thread(hwTask);

        t1.start();

    }
}
