package Threads.creating1stThread;

public class Client1to1000 {
    public static void main(String[] args) {
        System.out.println("Name of the thread is : "+Thread.currentThread().getName());
        for(int i=1 ; i<=1000 ; i++){
            Print1to1000 pp = new Print1to1000(i);
            Thread t = new Thread(pp);
            t.start();
        }
    }
}
