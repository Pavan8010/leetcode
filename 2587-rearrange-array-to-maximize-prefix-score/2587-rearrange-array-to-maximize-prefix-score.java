class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        long sum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>0){
                ans++;
            }
        }
        return ans;
    }
    void reverse(int[] array){
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}