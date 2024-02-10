package Threads.mergeSortThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arraytosort;
    private ExecutorService es;

    public Sorter(List<Integer> cur, ExecutorService es){
        arraytosort = cur;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" Array is : "+arraytosort);
        if(arraytosort.size()<=1) return arraytosort;

        int mid = arraytosort.size()/2;

        List<Integer> leftoSort = new ArrayList<>();
        List<Integer> rightoSort = new ArrayList<>();

        for(int i=0 ; i<mid ; ++i){
            leftoSort.add(arraytosort.get(i));
        }
        for(int i=mid ; i<arraytosort.size() ; ++i){
            rightoSort.add(arraytosort.get(i));
        }

        Sorter leftie = new Sorter(leftoSort, es);
        Sorter rightie = new Sorter(rightoSort, es);

        Future<List<Integer>> leftSortedFuture = es.submit(leftie);
        Future<List<Integer>> rightSortedFuture = es.submit(rightie);

        List<Integer> leftSorted = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();
//        System.out.println("left = "+leftSorted);
//        System.out.println("right = "+rightSorted);
        List<Integer> completeSorted = new ArrayList<>();
        int i=0,j=0;
        while(i<leftSorted.size() && j<rightSorted.size()){
            if(leftSorted.get(i) < rightSorted.get(j)) {
                completeSorted.add(leftSorted.get(i));
                ++i;
            }
            else{
                completeSorted.add(rightSorted.get(j));
                ++j;
            }
        }
        while(i<leftSorted.size()){
            completeSorted.add(leftSorted.get(i));
            ++i;
        }
        while (j<rightSorted.size()){
            completeSorted.add(rightSorted.get(j));
            ++j;
        }
//        System.out.println("c = "+completeSorted);
        return completeSorted;
    }
}
