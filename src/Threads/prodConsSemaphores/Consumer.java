package Threads.prodConsSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private Semaphore spProducer;
    private Semaphore spConsumer;

    public Consumer(Queue<Shirt> store, String name, Semaphore spProducer, Semaphore spConsumer) {
        this.store = store;
        this.name = name;
        this.spProducer = spProducer;
        this.spConsumer = spConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                spConsumer.acquire();
                store.poll(); //
                System.out.println(name + " consumed. Left shirts count = " + store.size());
                spProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
