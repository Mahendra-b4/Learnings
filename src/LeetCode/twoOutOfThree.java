package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(solver(nums1, nums2, nums3));
    }
    public static List<Integer> solver(int[] nums1, int[] nums2, int[] nums3){
        int[] count = new int[101];
        sorter(nums1, count);
        sorter(nums2, count);
        sorter(nums3, count);

        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<101 ; i++){
            if(count[i] >= 2){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void sorter(int[] nums, int[] count){
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                count[i]++;
            }
            set.add(i);
        }
    }
}
