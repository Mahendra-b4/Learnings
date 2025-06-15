package OOPS.lambdas;

public class RunnableDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = () -> {
            // code for run method
            System.out.println(Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.start();
        Runnable runn = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t5 = new Thread(runn);
        t5.start();

        Thread t1 = new Thread(() -> {System.out.println(Thread.currentThread().getName());});
        t1.start();
    }

}
