package Threads.creating1stThread;

public class HelloWorldTaskThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World from new Thread : "+Thread.currentThread().getName());
    }
}
