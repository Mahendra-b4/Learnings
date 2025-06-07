package LeetCode;

import java.util.*;

public class twoOutOfThree {
    public static void main(String[] args) {
//        int[] nums1 = {1,1,3,2};
//        int[] nums2 = {2,3};
//        int[] nums3 = {3};
//        System.out.println(solver(nums1, nums2, nums3));

        List<Integer> num = Arrays.asList(2,3,4,5);
        num.stream().map(number -> number * number).forEach(System.out::println);

        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * number).forEach(System.out::println);
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
