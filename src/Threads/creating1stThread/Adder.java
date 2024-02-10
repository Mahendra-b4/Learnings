package Threads.creating1stThread;

public class Adder implements Runnable{

    int a;
    int b;

    public Adder(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println(a+b);
    }
}
