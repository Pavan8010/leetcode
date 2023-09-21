class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i++;
            }
            else{
                nums[k] = nums2[j];
                j++;             
            }  
            k++;
        }
        while(i < m){
            nums[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        if((m+n)%2 == 1){
            return nums[(m+n)/2];
        }
        double a = nums[(m+n)/2];
        double b = nums[(m+n-1)/2];
        return (a+b)/2;
    }
}