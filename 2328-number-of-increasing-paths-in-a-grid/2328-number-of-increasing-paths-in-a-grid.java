class Solution {
    int mod = 1000000007;
    public int countPaths(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int ans = 0;
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(dp[i][j]==-1){
                    dfs(i,j,dp,grid);
                }
                ans = (ans + 1 + dp[i][j])%mod;
            }
        }
        return ans;
    }

    private int dfs(int i,int j,int[][] dp,int[][] grid){
        if(dp[i][j]!=-1){
            return dp[i][j];            
        }
        int count = 0;
        if(i>0 && grid[i-1][j] > grid[i][j]){
            count = (count + 1 + dfs(i-1,j,dp,grid))%mod;
        }
        if(i<grid.length-1 && grid[i+1][j] > grid[i][j]){
            count = (count + 1 + dfs(i+1,j,dp,grid))%mod;
        }
        if(j>0 && grid[i][j-1] > grid[i][j]){
            count =( count + 1 + dfs(i,j-1,dp,grid))%mod;
        }
        if(j<grid[0].length-1 && grid[i][j+1] > grid[i][j]){
            count = (count + 1 + dfs(i,j+1,dp,grid))%mod;
        }
        return dp[i][j] = count;
    }
}