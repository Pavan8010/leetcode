class Solution {
    public int rob(int[] nums) {
        int currMax=0,prevMax=0;
        for(int num:nums){
            int temp = currMax; // 0 1 2
            currMax = Math.max( prevMax+num , currMax); 
            prevMax = temp; // 0 1 2
        }
        return currMax;
    }
}
// max(1,0) = 1
// max(2,1) = 2
// max(4,2) = 4
// max(3,4) = 4