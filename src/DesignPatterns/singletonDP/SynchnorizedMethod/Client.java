package DesignPatterns.singletonDP.SynchnorizedMethod;


public class Client {

    public static void main(String[] args) throws InterruptedException {
//        Laptop laptop1 = Laptop.getInstance();
//        System.out.println(laptop1.hashCode());
//
//        Laptop laptop2 = Laptop.getInstance();
//        System.out.println(laptop2.hashCode());

        Thread t1 = new Thread(new t1());
        Thread t2 = new Thread(new t2());

        t1.start();
        t2.start();
//        t2.wait(20);
    }

    static class t1 implements Runnable{

        @Override
        public void run() {
            Laptop laptop = Laptop.getInstance("HP");
            System.out.println(laptop.getName());
        }
    }

    static class t2 implements Runnable{
        @Override
        public void run(){
            Laptop laptop = Laptop.getInstance("Dell");
            System.out.println(laptop.getName());
        }
    }
}
