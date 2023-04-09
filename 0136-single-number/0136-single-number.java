class Solution {
    public int singleNumber(int[] nums) {
        int curr = 0;
        for(int n:nums){
            curr ^= n;
        }
        return curr;
    }
}