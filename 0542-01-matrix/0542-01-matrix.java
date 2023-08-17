class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<>();        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                ans[i][j] = -1;
                if(mat[i][j]==0){
                    ans[i][j] = 0;
                    q.add(new int[]{i,j});
                }
            }
        }
        
        int dist = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] pos = q.poll();
                int row = pos[0];
                int col = pos[1];
                if(row>0 && ans[row-1][col] == -1){
                    ans[row-1][col] = dist;
                    q.add(new int[]{row-1,col});
                }
                if(row<mat.length-1 && ans[row+1][col] == -1){
                    ans[row+1][col] = dist;
                    q.add(new int[]{row+1,col});
                }
                if(col>0 && ans[row][col-1] == -1){
                    ans[row][col-1] = dist;
                    q.add(new int[]{row,col-1});
                }
                if(col<mat[0].length-1 && ans[row][col+1] == -1){
                    ans[row][col+1] = dist;
                    q.add(new int[]{row,col+1});
                }
            }
            dist++;
        }
        return ans;
    }
}