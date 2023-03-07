class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        int n = time.length;
        long left = 1;
        long right = (long)time[n-1] * totalTrips;
        // System.out.println(right);
        long ans = right;

        while(left<=right){
            long mid = right - (right-left)/2;
            // System.out.println(mid);
            if(isPossible(mid , time , totalTrips)){
                right = mid-1;
                ans = mid;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    boolean isPossible(long maxtrip,int[] time,int totalTrips){
        long maxposs = 0;
        for(int t:time){
            maxposs += maxtrip/t;
            if(maxposs >= totalTrips) return true;
        }
        return false;
    }
}