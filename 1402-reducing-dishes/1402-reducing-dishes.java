class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum =0,ans=0;
        int n = satisfaction.length;
        for(int i=n-1;i>=0;i--){
            if(satisfaction[i] + sum > 0){
                sum = sum + satisfaction[i];
                ans = ans + sum;
            }
        }
        return ans;   
    }
}
// -9 -8 -1 0 5
// 5 + (5 + 0) + (5 + -1) = 14