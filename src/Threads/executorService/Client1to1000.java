package Threads.executorService;

import Threads.creating1stThread.Print1to1000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client1to1000 {
    public static void main(String[] args) {
        System.out.println("Name of the thread is : "+Thread.currentThread().getName());
//        ExecutorService es = Executors.newFixedThreadPool(55);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=1 ; i<=1000 ; i++){
            if(i == 66){
                System.out.println("i = " +i);
            }
            Print1to1000 pp = new Print1to1000(i);
            es.submit(pp);
        }
    }
}
