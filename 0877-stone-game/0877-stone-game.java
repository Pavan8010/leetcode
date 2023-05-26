class Solution {
    public boolean stoneGame(int[] piles) {
        int sum1=0,sum2=0;
        int start=0,end = piles.length-1;
        int i=0;
        while(start<end){
            if(piles[start]>=piles[end]){
                if(i%2==0){
                    sum1 += piles[start];
                }else{
                    sum2 += piles[start];
                }
            start++;    
            }else{
                if(i%2==0){
                    sum1 += piles[end];
                }else{
                    sum2 += piles[end];
                }
            end--;
            }
        }
        if(sum1>sum2)return true;
        return false;
    }
}