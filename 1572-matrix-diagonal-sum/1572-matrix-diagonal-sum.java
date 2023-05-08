class Solution {
    public int diagonalSum(int[][] mat) {
        int ld = 0, rd = 0;
        int row = mat.length , col = mat[0].length;
        
        for(int i=0;i<row;i++){
            ld += mat[i][i];
        }   
        
        int i = 0 , j = col-1;
        while(i<row && j>=0){
            if(i==j){
                // rd += mat[i][j];
                i++;
                j--;
                continue;
            }
            rd += mat[i][j];
            i++;
            j--;
        }
        return ld+rd;
    }
}