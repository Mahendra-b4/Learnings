package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sequentialDigits {
    public static void main(String[] args) {
        int low = 234, high = 2314;
        System.out.println(sequentialDigits(low, high));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        boolean flag = true;
        // while(flag){
        int pre = 1;
        while(pre < 9){
            int cur = pre, p = pre;
            while(cur < high && p < 9){
                p++;
//                System.out.println("cur = "+cur +" ; p = "+p);
                cur = cur*10 + p;
                if(cur>=low && cur<=high){
                    ans.add(cur);
                }
            }
            pre++;
        }
        // }
        Collections.sort(ans);
        return ans;
    }
}
