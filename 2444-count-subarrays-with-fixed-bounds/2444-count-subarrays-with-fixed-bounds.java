class Solution {
    public long countSubarrays(int[] nums, int mink, int maxk) {
        long ans = 0;
        int maxpos = 0 , minpos=0, start = 0;
        boolean maxfind = false, minfind = false;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num<mink || num>maxk){
                maxfind = false;
                minfind = false;
                start = i+1;
            }
            if(num == mink){
                minfind = true;
                minpos = i;
            }
            if(num == maxk){
                maxfind = true;
                maxpos = i; 
            }
            if(maxfind && minfind){
                ans += (Math.min(maxpos,minpos)-start+1);
            }
        }
        return ans;
    }
}