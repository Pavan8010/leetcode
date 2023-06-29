class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = countone(i);
        }
        return ans;
    }
    int countone(int n){
        int cnt = 0;
        while(n!=0){
            int temp = n&1;
            cnt += temp;
            n = n>>>1;
        }
        return cnt;
    }
}