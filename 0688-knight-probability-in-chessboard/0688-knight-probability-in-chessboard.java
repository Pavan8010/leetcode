class Solution {
    static int[][] directions = {{-2, 1}, {-2, -1}, {-1, 2}, {-1, -2}, {1, 2}, {1, -2}, {2, 1}, {2, -1}};
    public double knightProbability(int n, int k, int row, int col) {
        double[][] dp = new double[n*n][k+1];
        return dfs(n, k, row, col, dp);
    }
    static double dfs(int n, int k, int r, int c, double[][] dp){
        if(k == 0) return 1.0D;
        if(dp[r*n+c][k] != 0) return dp[r*n+c][k];
        double ans = 0.0D;
        for(int[] dir: directions){
            int x = r + dir[0];
            int y = c + dir[1];
            if(x<n && y<n && x>=0 && y>=0){
                ans += (1.0/8.0)* dfs(n, k-1, x, y, dp);
            }
        }  
        return dp[(r*n)+c][k] = ans;
    }
}