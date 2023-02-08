class Solution {
    public int jump(int[] nums) {
        
        int curr = 0,max = 0,jump= 0;
        
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]+i > max){
                max = nums[i]+i;
            }
            
            if(i==curr){
                jump++;
                curr = max;
            }
        }
        return jump;
    }
}