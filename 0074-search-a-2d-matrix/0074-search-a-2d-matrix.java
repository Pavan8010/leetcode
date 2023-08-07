class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr:matrix){
            int start=0,end=arr.length-1;
            while(start<=end){
                int mid = start - (start-end)/2;
                if(arr[mid]==target)return true;
                if(arr[mid]>target){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        } 
        return false;  
    }
}