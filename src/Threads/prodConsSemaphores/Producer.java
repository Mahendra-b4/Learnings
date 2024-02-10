package Threads.prodConsSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore spProducer;
    private Semaphore spConsumer;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore spProducer, Semaphore spConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.spProducer = spProducer;
        this.spConsumer = spConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                spProducer.acquire();
                store.offer(new Shirt());
                System.out.println(name + " produced. Left shirts count = " + store.size());
                spConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
