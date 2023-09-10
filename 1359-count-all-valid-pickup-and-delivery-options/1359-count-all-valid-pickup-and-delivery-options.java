class Solution {
    public int countOrders(int n) {
        int mod = 1000000007;
        long[] dp = new long[n+1];
        dp[0] = 1;
        for (int i=1; i<dp.length;i++) {
            long k=i*(i+(i-1));
            dp[i] =(dp[i-1]*k)%mod;
        }
        return (int)dp[dp.length-1];
    }
}