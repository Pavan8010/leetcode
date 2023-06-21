class Solution {
    public long minCost(int[] nums, int[] cost) {
        int low = nums[0];
        int high = nums[0];
        for(int num:nums){
            low = Math.min(low,num);
            high = Math.max(high,num);
        }
        long ans=0;
        while(low<high){
            int mid = (low + high)/2;
            long cost1 = check(nums,cost,mid);
            long cost2 = check(nums,cost,mid+1);
            if(cost1 > cost2){
                low = mid+1;
                ans = cost2;
            }else{
                high = mid;
                ans = cost1;
            }
        }
        return ans;
    }
    long check(int[] nums,int[] cost , int ele){
        long tmp= 0L;
        for(int i=0;i<nums.length;i++){
            tmp += 1L*cost[i] * Math.abs(nums[i]-ele);
        }
        return tmp;
    }
}