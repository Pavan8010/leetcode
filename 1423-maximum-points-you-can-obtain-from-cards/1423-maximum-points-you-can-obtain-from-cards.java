class Solution {
    public int maxScore(int[] card, int k) {  
        int n = card.length;
        int left=0,j=n-k;

        int total=0;
        for(int i = j; i < card.length; i++) {
            total+=card[i]; 
        }
        int ans = total;

        while(j<n) {
            total += card[left] - card[j];
            ans = Math.max(ans, total);
            left++;
            j++;
        }
        return ans;
    }
}