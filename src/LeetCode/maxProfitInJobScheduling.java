package LeetCode;

import java.util.Arrays;
import java.util.TreeMap;

public class maxProfitInJobScheduling {
    public static void main(String[] args) {
        int[] startTime = {1,2,3,4,6};
        int[] endTime = {3,5,10,6,9};
        int[] profit = {20,20,100,70,60};
        System.out.println(jobScheduling(startTime, endTime, profit));
        System.out.println(usingBinarySearch(startTime, endTime, profit));
    }
    public static int usingBinarySearch(int[] startTime, int[] endTime, int[] profit){
        int n = startTime.length;
        int[][] arr = new int[n][];
        for(int i=0 ; i<n ; i++){
            arr[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        int[] dp = new int[n+1];
        for(int i=0 ; i<n ; ++i){
            int value = binarySearch(arr, arr[i][1], i);
            dp[i+1] = Math.max(dp[i], arr[value][2]+arr[i][2]);
        }
        return dp[n];
    }

    public static int binarySearch(int[][] arr, int endTime, int endIndex){
        int l = 0;
        int r = endIndex;
        while(l < r){
            int mid = l + (r-l)/2;
            if(arr[mid][1] <= endTime){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] arr = new int[n][];
        for(int i=0 ; i<n ; i++){
            arr[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0,0);
        for(int[] crr:arr){
//            greater val <= start time
            int current = map.floorEntry((crr[0])).getValue()+crr[2];
            if(current > map.lastEntry().getValue()){
                map.put(crr[1], current);
            }
        }
        return map.lastEntry().getValue();
//            for(int i=0 ; i<n ; i++){
//                System.out.println(Arrays.toString(arr[i]));
//            }
//            int[] dp = new int[n];
//            return getSol(arr, 0, 0, dp);
//            return recursion(startTime, endTime, profit, n-1, dp, 0);
    }
    public static int getSol(int[][] arr, int n, int endTime, int[] dp){
        if(n == dp.length){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        if(endTime <= arr[n][0]){
            dp[n] = Math.max(arr[n][2]+getSol(arr, n+1, arr[n][1], dp), getSol(arr, n+1, arr[n][1], dp));
        }
        else {
            dp[n] = getSol(arr, n+1, arr[n][1], dp);
        }
        return dp[n];
    }
    public static int recursion(int[] startTime, int[] endTime, int[] profit, int n, int[] dp, int lastTime){
        if(n <= 0) {
            return 0;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
//        for(int i=n-1 ; i>=0 ; i--){
        if(startTime[n-1] >= lastTime){
            dp[n] = Math.max(recursion(startTime, endTime, profit, n-1, dp, endTime[n-1])+profit[n-1],
                    recursion(startTime, endTime, profit, n-1, dp, lastTime));
        }
        else {
            dp[n] = recursion(startTime, endTime, profit, n-1, dp, lastTime);
        }
        return dp[n];
//        }
    }
}
