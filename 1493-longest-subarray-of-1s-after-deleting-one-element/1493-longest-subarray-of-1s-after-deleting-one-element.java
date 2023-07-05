class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0,ans=0,left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;

            while(zero>1){
                if(nums[left]==0)zero--;
                left++;
            }
            ans = Math.max(ans,(i-left));
        }
        return ans;
    }
}