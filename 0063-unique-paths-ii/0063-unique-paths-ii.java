class Solution {
    int[][] dp;
    Integer[][] memo;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp=obstacleGrid;
        memo=new Integer[dp.length][dp[0].length];
        return helper(0, 0);
    }
    int helper(int i, int j) {
        if(i==dp.length || j==dp[0].length || dp[i][j]==1) return 0;
        if(i==dp.length-1 && j==dp[0].length-1) return 1;
        if(memo[i][j]!=null) return memo[i][j];
        return memo[i][j]= helper(i+1,j) + helper(i,j+1);
    }
}