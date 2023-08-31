class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n+1];
        for(int i=0;i<n+1;i++){
            int start = Math.max(0,i-ranges[i]);
            int end = i + ranges[i];
            maxReach[start] = end;
        }
        // System.out.println(Arrays.toString(maxReach));
        int ans=0,currEnd=0,nextEnd=0;
        for(int i=0;i<n+1;i++){
            if(i > nextEnd) return -1;
            if(i > currEnd){
                ans++;
                currEnd = nextEnd;
            }
            nextEnd = Math.max(nextEnd,maxReach[i]);
        }
        return ans;
    }
}

/*
[5, 3, 4, 0, 4, 5]
0 0 0
0 5 0
5 5 1
5 5 1
5 5 1
5 5 1
*/