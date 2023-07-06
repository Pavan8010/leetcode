class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left=0,currSum=0,ans=n+1;
        for(int right=0;right<nums.length;right++){
            currSum += nums[right];

            while(left<right && (currSum-nums[left])>=target){
                currSum -= nums[left];
                left++;
            }

            if(currSum>=target){
                ans = Math.min(ans,right-left+1);
            }
        }
        if(ans==n+1)return 0;
        return ans;
    }
}