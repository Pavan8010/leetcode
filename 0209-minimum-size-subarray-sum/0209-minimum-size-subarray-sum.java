class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] cummu = new int[nums.length +1];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            cummu[i+1] = sum;
        }
        if(sum<target){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num = cummu[i+1] - target;
            int idx = upper_bound(cummu,0,i,num);
            if(idx != -1){
                ans = Math.min(ans,i-idx+1);
            }
        }
        return ans;
    }
    public int upper_bound(int arr[], int l, int r, int x){
    while(l <= r){
        int mid = l + (r-l)/2;
        if(arr[mid] == x){
            return mid;  
        }
        else if(arr[mid] < x){
            if(arr[mid+1] > x){
                return mid;
            }
            l = mid+1;
        } 
        else {        
            r = mid-1;
        }
    }
    return -1;
    }
}
        // for(int i:cummu){
        //     System.out.print(i+" ");
        // }
        // System.out.println(upper_bound(cummu,target));