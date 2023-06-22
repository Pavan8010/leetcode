class Solution {
    public int longestOnes(int[] nums, int k) {
        int one=0,zero=0;
        int left = 0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;
            else one++;
            while(zero>k){
                if(nums[left]==0)zero--;
                else one--;
                left++;
            }
            ans = Math.max((i-left)+1,ans);
        }
        return ans;
    }
}