class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = intervals[0][1];
        int curr = 1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= end){
                curr++;
                end = intervals[i][1];
            }
        }
        return intervals.length-curr;   
    }
}
// [[1,2],[2,3],[1,3],[3,4]]