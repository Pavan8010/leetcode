class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int temp = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1] + 1){
                    temp++;
                }
                else{
                    max = Math.max(max,temp);
                    temp = 1;
                }
            }
        }
        return Math.max(max,temp);
    }
}