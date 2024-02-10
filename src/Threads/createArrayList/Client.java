package Threads.createArrayList;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 9;

        ExecutorService es = Executors.newCachedThreadPool();
        ArrayCreator ac = new ArrayCreator(n, es);

        Future<List<Integer>> ansFut = es.submit(ac);
        List<Integer> ans = ansFut.get();
        System.out.println(ans);

    }
}
