package LeetCode;

import java.util.Arrays;
import java.util.Queue;

class pair{
    int i; int j;
    pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class cherry_pickup_II {
    public static void main(String[] args) {
        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }

    public static int cherryPickup(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n+1][m+1][m+1];
        return getMaxValue(grid, dp, 0, 0, m-1);
    }
    public static int getMaxValue(int[][] grid, int[][][]dp, int cur_row, int curAcol, int curBcol){
        int len = grid[0].length;
        if(curAcol<0 || curBcol<0 || curBcol>=len || curAcol>=len){
            return 0;
        }
        if(cur_row == grid.length){
            return 0;
        }
        if(dp[cur_row][curAcol][curBcol] != 0){
            return dp[cur_row][curAcol][curBcol];
        }
        int ans = 0;
        ans = grid[cur_row][curAcol] + grid[cur_row][curBcol];

        int max = 0;
        for(int i=curAcol-1 ; i<= curAcol+1 ; i++){
            for(int j=curBcol-1 ; j<=curBcol+1 ; j++){
                if(i < j)
                    max = Math.max(max, getMaxValue(grid, dp, cur_row+1, i, j));
            }
        }
        ans += max;
        dp[cur_row][curAcol][curBcol] = ans;
        return dp[cur_row][curAcol][curBcol];
    }
}
