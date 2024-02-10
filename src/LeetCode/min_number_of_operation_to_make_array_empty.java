package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class min_number_of_operation_to_make_array_empty {

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(map.get(i), 1)+1);
//            if(map.containsKey(i)){
//                map.put(i, map.get(i)+1);
//            }
//            else{
//                map.put(i, 1);
//            }
        }

        int count = 0;
        int val = 0;
        System.out.println(map);
        for(int k: map.values()){
            if(k == 1){
                return -1;
            }
            count += k/3;
            k %= 3;
            if(k != 0 && k != 1) {
                count += k / 2;
//            System.out.println("k = "+k + " val = "+k/2);
            }
            if(k == 1){
                count++;
            }
        }
//        if(val == map.size()){
//            return count;
//        }
        return count;
    }
    public static int getLeastValue(int k){
        int ans = 0;
        ans += k/3;
//        System.out.println("k = "+k + " val = "+k/3);
        k %= 3;
        if(k != 0 && k != 1) {
            ans += k / 2;
//            System.out.println("k = "+k + " val = "+k/2);
        }
        if(k == 1){
            ans++;
        }
//        if(k%3 == 0){
//            System.out.println("k = "+k + "val = "+k/3);
//            ans += k/3;
//            k %= 3;
//        }
//        if(k%2 == 0){
//            ans += k/2;
//            System.out.println("k = "+k + "val = "+k/2);
//        }
        return ans;
    }
}
