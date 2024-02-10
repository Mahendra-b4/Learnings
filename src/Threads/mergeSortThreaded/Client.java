package Threads.mergeSortThreaded;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> k = List.of(2,5,7,4,12,1,0);
        System.out.println(Thread.currentThread().getName());
        ExecutorService es = Executors.newCachedThreadPool();
//        List<Integer> pp = new ArrayList<>();
        Sorter s = new Sorter(k, es);
        Future<List<Integer>> ansFuture = es.submit(s);

        List<Integer> ans = ansFuture.get();
        System.out.println(ans);
//        System.out.println(es.isTerminated());
        es.shutdown();
    }
}
