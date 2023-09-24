class Solution {
    public double champagneTower(int poured, int row, int glass) {
        double[][] ans = new double[101][101];
        ans[0][0]=poured;
        for(int i=0;i<100;i++){
            // if(i>row)return ans[row][glass];
            for(int j=0;j<=i;j++){
                if(ans[i][j]>1){
                    ans[i+1][j] += (ans[i][j]-1)/2.0;
                    ans[i+1][j+1] += (ans[i][j]-1)/2.0;
                    ans[i][j]=1;
                    if(i==row && j==glass)return ans[row][glass];
                }
            }
        }
        return ans[row][glass];
    }
}