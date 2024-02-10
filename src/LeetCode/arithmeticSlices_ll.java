package LeetCode;

import java.util.HashMap;

public class arithmeticSlices_ll {
    public static void main(String[] args) {
//        int[] nums = {0,2000000000,-294967296};
//        int[] nums = {0,1,2,2,2};
        int[] nums = {79,20,64,28,67,81,60,58,97,85,92,96,82,89,46,50,15,2,36,44,54,2,90,37,7,79,26,40,34,67,64,28,60,89,46,31,9,95,43,19,47,64,48,95,80,31,47,19,72,99,28,46,13,9,64,4,68,74,50,28,69,94,93,3,80,78,23,80,43,49,77,18,68,28,13,61,34,44,80,70,55,85,0,37,93,40,47,47,45,23,26,74,45,67,34,20,33,71,48,96};
//        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(solver(nums));
    }


    public static int solver(int[] nums){
        int n = nums.length;
        int total_count = 0;

        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; ++i) {
            dp[i] = new HashMap<>();
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                long diff = (long) nums[i] - nums[j];

                if (diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE) {
                    continue;
                }

                int diffInt = (int) diff;

                dp[i].put(diffInt, dp[i].getOrDefault(diffInt, 0) + 1);
                if (dp[j].containsKey(diffInt)) {
                    dp[i].put(diffInt, dp[i].get(diffInt) + dp[j].get(diffInt));
                    total_count += dp[j].get(diffInt);
                }
            }
        }

        return total_count;
    }
    public static int binomialCoefficient(int n, int k, int[][] dp) {
        if (k == 0 || k == n) {
            return 1;
        }
        if(dp[n][k] != 0){
            return dp[n][k];
        }
        else {
            return dp[n][k] = binomialCoefficient(n - 1, k - 1, dp) + binomialCoefficient(n - 1, k, dp);
        }
    }
    public static int solve(int[] nums){
        int n = nums.length;
        if(n < 3){
            return 0;
        }
        HashMap<Long, Integer> map = new HashMap<>();
        int max = 0;
        for(int i:nums){
            map.put((long)i, map.getOrDefault((long)i, 0)+1);
            max = Math.max(max, i);
        }
        if(map.size() == 1){
            int totalCount = 0;

            // Calculate the sum of binomial coefficients for k = 3 to n
            for (int k = 3; k <= n; k++) {
                int[][] dp = new int[n+1][k+1];
                totalCount += binomialCoefficient(n, k, dp);
            }

            return totalCount;
        }
        System.out.println("map = "+map);
        int sum = 0;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                long val = (long)nums[j]-nums[i];
                long adder = val;
                while(val <= max) {
                    if(adder == 0){
//                        if(map.get(nums[j]) > 2){
////                            System.out.println("1<<(map.get(nums[j])-1) = "+(1<<(map.get(nums[j])-1)));
//                            sum += (map.get(nums[j])-2);
//                        }
                        break;
                    }
                    if (map.containsKey(nums[j] + val)) {
                        int count = map.get(nums[j] + val);
//                        System.out.println("nums[i] = " + nums[i] + " ; nums[j] = " + nums[j]);
//                        System.out.println("target = " + (nums[j] + val) + " ; count = " + count);
                        sum += count;
//                        System.out.println("sum = " + sum);
                    }
                    else{
                        break;
                    }
//                    System.out.println("val = "+val);
                    val += adder;
                }
            }
        }
        if(map.size() != n){
//            System.out.println("hi === ");
            sum += n-1-map.size();
        }
        return sum;
    }
}
