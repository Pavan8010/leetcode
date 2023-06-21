class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        long[] arr = new long[nums.length];
        arr[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i] = arr[i-1] + nums[i];
        }
        int j=0;
        for(int i=k-1;i<nums.length;i++){
            long temp = arr[i];
            if(i != k-1){
                temp -= arr[j++];
            }
            ans = Math.max(ans,(double)temp/k);
        }
        return ans;
    }
}