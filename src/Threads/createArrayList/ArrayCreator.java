package Threads.createArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ArrayCreator implements Callable<List<Integer>>{

    public int n;
    public ExecutorService es;

    public ArrayCreator(int n, ExecutorService es){
        this.n = n;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception{
        List<Integer> ans = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            ans.add(i);
        }
        return ans;
    }
}
