package Threads.creating1stThread;

public class Client {
    public static void main(String[] args) {
        System.out.println("From main : " + Thread.currentThread().getName());
        HelloWorldTaskThread hwTask = new HelloWorldTaskThread();
        Thread t1 = new Thread(hwTask);
        Thread t2 = new Thread(hwTask);
        t1.setPriority(1);
        t1.start();
        t1.stop();
        System.out.println("line 12: "+t1.isDaemon());
        t2.setPriority(2);
        t2.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

    }
}
