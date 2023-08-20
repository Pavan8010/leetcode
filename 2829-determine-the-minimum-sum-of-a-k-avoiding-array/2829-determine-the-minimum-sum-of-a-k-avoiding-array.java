class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int ans=0;
        for(int i=1, j=1;i<=n;i++, j++){
            while(set.contains(j)){
                j++;
            } 
            ans += j;
            if(k-j >= 0) set.add(k-j);
        }
        return ans;
    }
}
// 15+(5+1)-(4-1) =18
// 2 1
// 3+2-1+2
// 1 2 3 4 5