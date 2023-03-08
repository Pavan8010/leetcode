class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int left = 1;
        int right = piles[n-1];
        while(left<right){
            int mid = (left+right)/2;
            // int mid = right - (right-left)/2;
            // int mid = left + (right-left)/2;4
            
            // System.out.println(mid);
            if(isPossible(mid,piles,h)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    boolean isPossible(int hr,int[] piles,int h){
        int temp = 0;
        for(int i:piles){
            if(i%hr==0){
                temp += i/hr;
            }else{
                temp += i/hr + 1;
            }
        }
        // System.out.println(temp);
        if(temp<=h)return true;
        return false;
    }
}