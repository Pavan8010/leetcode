class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        int max = Math.min(height[i],height[j])*(j-i);
        while(i<j){
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
            int h = Math.min(height[i],height[j]);
            max = Math.max(max,(h*(j-i)));
        }
        return max;
    }
}