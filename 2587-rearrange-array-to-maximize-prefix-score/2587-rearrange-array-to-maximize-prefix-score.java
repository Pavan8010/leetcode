class Solution {
    public int maxScore(int[] nums) {
        long sum = 0;
        int i=nums.length-1;
        Arrays.sort(nums);
        if(nums[nums.length-1] == 0)    return 0;
        while(i >= 0){
            sum += nums[i--];
            if(sum <= 0) return nums.length-i-2;
        }
        return nums.length;
    }
}