class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int row = mat.length, col = mat[0].length, index = 0;
        for(int c = 0; c < col; c++){
            for(int r = 0; r < row; r++){
                if(mat[r][c] == 0){
                    if(c > 0 && mat[r][c - 1] == 1){
                        result[index++] = r;
                    }else if(c == 0){
                        result[index++] = r;
                    }
                    
                    if(index == k) return result;
                }
            }  
        }
        // System.out.println(Arrays.toString(result));    
        for(int r = 0; r < row; r++){
            if(mat[r][col - 1] == 1){  
                result[index++] = r;
                if(index == k) return result;
            }
        }
        return new int[1];
    }
}
// 1 0 
// 1 0
// 1 0
// 1 1