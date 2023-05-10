class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        int direction = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        while (num <= n * n) {
            matrix[row][col] = num;
            num++;
            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || matrix[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
            }
            row += dr[direction];
            col += dc[direction];
        }
        return matrix;
    }
}