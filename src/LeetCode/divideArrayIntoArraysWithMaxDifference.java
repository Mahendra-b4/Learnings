package LeetCode;

import java.util.Arrays;

public class divideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] nums = {1,3,3,2,7,3};
        int k = 3;
        int[][] ans = divideArray(nums, k);
        for(int i=0 ; i<ans.length ; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        int p = 0;
        for(int i=0 ; i<n ; i=i+3){
            if(nums[i+2]-nums[i] <= k){
                ans[p][0] = nums[i];
                ans[p][1] = nums[i+1];
                ans[p][2] = nums[i+2];
//                System.out.println(Arrays.toString(ans[p]));
//                System.out.println("indide");
            }
            else{
                int[][] sol = new int[0][];
                return sol;
            }
            p++;
        }
//        for(int i=0 ; i<ans.length ; i++){
//            System.out.println(Arrays.toString(ans[i]));
//        }
        return ans;
    }
}
