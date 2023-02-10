class Solution {
    public int maxDistance(int[][] grid) {
        int[] dx = new int[] {-1, 0, 1, 0};
        int[] dy = new int[] {0, 1, 0, -1};
        int n = grid.length;
        int[][] visited = new int[n][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {
                if(grid[i][j] == 1) {
                    //x, y, steps
                    q.add(new int[]{i, j, 0});
                    visited[i][j] = 1;
                }    
            }
        }

        // BFS
        int res = -1;
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            res = Math.max(res, curr[2]);

            for(int i=0; i < 4; i++) {
                //change direction
                int x = dx[i] + curr[0];
                int y = dy[i] + curr[1];
                //check it is valid coordinates ans alredy visited or not
                if(x >=0 && x < n && y >= 0 && y < n && visited[x][y] == 0) {
                    q.add(new int[]{x, y, curr[2] + 1});
                    visited[x][y] = 1;
                }
            }
        }

        return res == 0 ? -1 : res;
    }
}