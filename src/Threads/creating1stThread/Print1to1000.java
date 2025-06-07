package Threads.creating1stThread;

public class Print1to1000 implements Runnable{
    private int p;
    public Print1to1000(int k){
        this.p = k;
    }

    @Override
    public void run() {
        System.out.println("The number is : "+p+" the thread is : "+ Thread.currentThread().getName());
    }
}
