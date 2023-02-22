class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0,end=0;
        for(int i:weights){
            start = Math.max(i,start);
            end +=i;
        }
        int mid = 0,ans = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(check(weights , days,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;      
    }
    static boolean check(int[] weights, int days,int capacity){
        int mindays = 1;
        int curr = 0;
        for(int i:weights){
            if(curr+i>capacity){
                mindays++;
                curr = 0;
            }
            curr += i;
        }
        if(mindays > days){
            return false;
        }
        return true;
    }
}