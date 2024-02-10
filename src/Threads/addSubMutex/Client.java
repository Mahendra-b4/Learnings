package Threads.addSubMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder ad = new Adder(count, lock);
        Subtractor sb = new Subtractor(count, lock);

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
