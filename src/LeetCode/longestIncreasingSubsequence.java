package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class longestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] nums = {3,5,6,2,5,4,19,5,6,7,12};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1 ; i<n ; i++){
            if(nums[i] > list.get(list.size()-1)){
                list.add(nums[i]);
            }
            else{
//                int ind = list.
                int st = 0, en = list.size()-1;
                while(st < en){
                    int mid = ((en-st)/2)+st;
//                    if(list.get(mid) == nums[i]){
//                        continue;
//                    }
                    if(list.get(mid) < nums[i]){
                        st = mid+1;
                    }
                    else{
                        en = mid;
                    }
                }
                list.set(st, nums[i]);
            }
            System.out.println(list);
        }

        return list.size();
    }
}
