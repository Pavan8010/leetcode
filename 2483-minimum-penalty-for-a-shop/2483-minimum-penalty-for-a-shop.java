class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int cnt=0,ans=-1,max=0;
        for(int i=0;i<n;i++){
            cnt += customers.charAt(i)=='Y' ? 1:-1;
            if(cnt>max){
                max = cnt;
                ans = i;
            }
        }
        return ans+1;
    }
}