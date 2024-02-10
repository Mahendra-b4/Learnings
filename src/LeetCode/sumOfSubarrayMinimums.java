package LeetCode;

import java.util.Stack;

public class sumOfSubarrayMinimums {

    public static void main(String[] args) {
        int[] arr = {71,55,82,55};
        /*
        71, 71'55, 71'55'82, 71'55'82'55,
        55, 55'82, 55'82'55
        82, 82'55
        55
         */
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        long mod = 1000000007;
        long ans = 0l;
        int n = arr.length;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] next_smaller = new int[n];
        int[] pre_smaller = new int[n];

        for(int i=n-1 ; i>=0 ; i--){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                next_smaller[i] = n;
            }
            else{
                next_smaller[i] = st1.peek();
            }
            st1.push(i);
        }
        for(int i=0 ; i<n ; i++){
            while(!st2.isEmpty() && arr[st2.peek()] >= arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                pre_smaller[i] = -1;
            }
            else{
                pre_smaller[i] = st2.peek();
            }
            st2.push(i);
        }
        for(int i=0 ; i<n ; i++){
            long factor = (long)(i-pre_smaller[i]) * (next_smaller[i]-i);
            factor *= arr[i];
            ans += factor;
            ans %= mod;
        }

        return (int)(ans%mod);
    }
}
