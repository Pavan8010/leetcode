class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int u = nums.length-1;
        int l = 0;
        for(int i = 0; i<nums.length; i++){
            while(u>0 && nums[i]+nums[u] > upper){
                u--;
            }
            l = i+1;
            while(l<nums.length && nums[i]+nums[l] < lower){
                l++;
            }
            if(l<=u){
                count += u-l+1;
            }
        }
        return count;
    }
}