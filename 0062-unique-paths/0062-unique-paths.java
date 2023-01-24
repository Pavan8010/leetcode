class Solution {
    public int uniquePaths(int m, int n) {
        return maze(m,n,new int[m + 1][n + 1]);
    }
    static int maze(int r , int c,int arr[][]){
        if(r<1 || c<1){
            return 0;
        }
        if(r==1 || c==1){
            return 1;
        }
        if(arr[r][c] != 0){
            return arr[r][c];
        }
        int left = maze(r-1,c,arr);
        int right = maze(r,c-1,arr);
        arr[r][c] = left + right;
        return arr[r][c];
    }
}