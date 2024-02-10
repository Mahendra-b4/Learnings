package Threads.prodConsSemaphores;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Queue<Shirt> store = new ArrayDeque<>(); // store
        int maxSizeOfStore = 20;

        Semaphore spProducer = new Semaphore(maxSizeOfStore);
        Semaphore spConsumer = new Semaphore(0);

        Producer p1 = new Producer(store, maxSizeOfStore, "p1", spProducer, spConsumer);
        Producer p2 = new Producer(store, maxSizeOfStore, "p2", spProducer, spConsumer);
        Producer p3 = new Producer(store, maxSizeOfStore, "p3", spProducer, spConsumer);

        Consumer c1 = new Consumer(store, "c1", spProducer, spConsumer);
        Consumer c2 = new Consumer(store, "c2", spProducer, spConsumer);
        Consumer c3 = new Consumer(store, "c3", spProducer, spConsumer);
        Consumer c4 = new Consumer(store, "c4", spProducer, spConsumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();

//        spProducer.

    }
}
