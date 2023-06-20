class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long[] arr = new long[n+1];
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            arr[i+1] = arr[i]+nums[i]; 
        }

        Arrays.fill(ans, -1);
        for(int i=k;i<n-k;i++){
            ans[i] = (int)((arr[i+k+1]-arr[i-k])/(2*k+1));
        }
        return ans;
    }
}
//n-k = 9-3 = 6
// - -  -           -  -  -
// 0 1  2  3  4  5  6  7  8 9 // nums
// 0 7 4  3  9  1  8  5  2  6 // i
// 7 11 14 23 24 32 37 39 45 //  arr