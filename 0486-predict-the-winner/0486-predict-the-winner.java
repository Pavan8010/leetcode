class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,nums.length)>=0;
    }
    public int helper(int[] nums,int i,int j,int n){
        if(i==j){
            return nums[i];
        }
        int left=nums[i]-helper(nums,i+1,j,n);
        int right=nums[j]-helper(nums,i,j-1,n);
        return Math.max(left,right);
    }
}