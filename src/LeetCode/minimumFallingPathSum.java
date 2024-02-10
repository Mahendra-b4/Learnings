package LeetCode;

import java.util.Arrays;

public class minimumFallingPathSum {

    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i=0 ; i<n ; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0 ; i<m ; i++){
            ans = Math.min(ans, recursion(matrix, 0, i, dp));
        }
        return ans;
    }

    public static int recursion(int[][] matrix, int i, int j, int[][] dp){
//        if(i<0 || i>=matrix.length || j<0 || j>=matrix.length){
//            return Integer.MAX_VALUE;
//        }
        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }
        if(i == matrix.length-1){
            return dp[i][j] = matrix[i][j];
        }
        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        if(j > 0){
            left = recursion(matrix, i+1, j-1, dp);
        }
        if(j < matrix.length-1){
            right = recursion(matrix, i+1, j+1, dp);
        }
        int strt = recursion(matrix, i+1, j, dp);

        dp[i][j] = Math.min(left, Math.min(right, strt))+matrix[i][j];
        return dp[i][j];
    }
}
