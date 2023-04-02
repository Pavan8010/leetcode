class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0,n=reward1.length;
        
        for(int i=0;i<n;i++){
            reward1[i] = reward1[i]-reward2[i];
            ans += reward2[i];
        }  
        Arrays.sort(reward1);
        for(int i=0;i<k;i++){
            ans += reward1[n-i-1];
        }
        return ans; 
    }
}