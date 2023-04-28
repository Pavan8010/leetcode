class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int proc = 1;
        boolean zero = false;
        int idx = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(zero){
                    return ans;
                }else{
                    zero = true;
                    idx = i;
                }
            }else{
                proc = nums[i]*proc;
            }
        }
        if(zero){
            ans[idx] = proc;
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i] = proc/nums[i];
        }
        return ans;
    }
}