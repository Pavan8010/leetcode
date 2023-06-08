class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int[] arr:grid){
            int start=0;
            int end = arr.length;
            while(start<end){
                int mid = start + (end-start)/2;
                if(arr[mid]<0) end = mid;
                else start = mid+1;    
            }
            sum = sum+arr.length-start;
        }
        return sum;
    }
}