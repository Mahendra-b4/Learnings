package Threads.creating1stThread;

public class PrintNumsByThreads implements Runnable{
    int number;
    PrintNumsByThreads(int number){
        this.number = number;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ;
        System.out.println("Number = "+number+" and Thread name = "+Thread.currentThread().getName());
    }
}
