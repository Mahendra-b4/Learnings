package Threads.adderSubtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder ad = new Adder(count);
        Subtractor sb = new Subtractor(count);

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
