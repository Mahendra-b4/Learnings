package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Subsets_II {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<Integer> ins = new ArrayList<>();
        recursion(0, n, nums, ins);
//        return (List<List<Integer>>) hs;
        return ans;
    }

    static List<List<Integer>> ans = new ArrayList<>();
    static HashSet<List<Integer>> hs = new HashSet<>();
    public static void recursion(int p, int n, int[] nums, List<Integer> ins){
        if(p == n){
            if(!hs.contains(ins)){
                ans.add(new ArrayList<>(ins));
                hs.add(ins);
            }
//            hs.add(ins);
            return;
        }

        ins.add(nums[p]);
        recursion(p+1, n, nums, ins);
        ins.remove(ins.size()-1);
        recursion(p+1, n, nums, ins);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
