class Solution {
    public int uniquePaths(int m, int n) {
        return helper(new int[m+1][n+1],m,n);
    }
    int helper(int[][] arr ,int row,int col){
        if(row<1 || col<1)return 0;
        if(row==1 || col==1)return 1;
        if(arr[row][col]!=0)return arr[row][col];
        int down = helper(arr,row-1,col);
        int right = helper(arr,row,col-1);
        arr[row][col] = down+right;
        return arr[row][col];
    }
}
