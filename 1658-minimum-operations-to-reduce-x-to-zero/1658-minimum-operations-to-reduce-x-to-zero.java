class Solution {
    public int minOperations(int[] nums, int x) {
        int sum =0;
        int n =nums.length;
        for(int num:nums)sum+=num;
        int target = sum-x;
        if(target<0)return -1;
        if(target==0)return n;
        int left=0,right=0;
        int cnt=Integer.MAX_VALUE;
        sum=0;
        while(right<n){
            sum += nums[right];
            right++;
            while(sum>target && left<n){
                sum -= nums[left];
                left++;
            }
            if(sum==target){
                cnt = Math.min(cnt,n-(right-left));
            }
        }
        return (cnt == Integer.MAX_VALUE) ? -1:cnt;
    }
}