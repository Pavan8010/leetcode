class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n=nums.length;
        int ans=0,j=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            while(j<i && nums[i]-nums[j]>2*k){
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}
// 1 2 4 6