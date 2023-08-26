class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;
        int curr = Integer.MIN_VALUE;
        for(int[] pair: pairs){
            if(curr<pair[0]){
                curr = pair[1];
                cnt++;
            }
        }
        return cnt;
    }
}