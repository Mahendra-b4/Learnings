package Threads.mergeSortNonThreaded;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> k = List.of(2,5,7,4,12,1,0);

        Sorter s = new Sorter(k);

        List<Integer> ans = s.call();

        System.out.println(ans);
    }
}
