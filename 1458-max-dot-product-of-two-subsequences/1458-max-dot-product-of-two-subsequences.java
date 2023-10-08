class Solution{
    int ans=Integer.MIN_VALUE;
    public int recursion (int nums1[],int nums2[],int i,int j,int dp[][]){
        if (i>=nums1.length || j>=nums2.length) return 0;
        if (dp[i][j]!=-1) return dp[i][j];

        int takeboth=nums1[i]*nums2[j] +recursion (nums1,nums2,i+1,j+1,dp);
        int takeone=recursion (nums1,nums2,i+1,j,dp);
        int taketwo=recursion (nums1,nums2,i,j+1,dp);

        int maxfall=Math.max (takeboth,Math.max (takeone,taketwo));
        if (maxfall==0){
            ans=Math.max(ans,nums1[i]*nums2[j]);
        }
        else{
            ans=Math.max (ans,maxfall);
        }
        return dp[i][j]=maxfall;
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int dp[][]=new int [nums1.length+1][nums2.length+1];
        for (int t[]:dp) Arrays.fill (t,-1);
        recursion (nums1,nums2,0,0,dp);
        return ans;   
    }
}