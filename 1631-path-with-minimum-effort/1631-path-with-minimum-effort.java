class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int[][] minEfforts = new int[rows][cols];
        for (int[] row : minEfforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        minHeap.offer(new int[]{0, 0, 0});
        minEfforts[0][0] = 0;
        while (!minHeap.isEmpty()) {
            int[] cell = minHeap.poll();
            int row = cell[0];
            int col = cell[1];
            int effort = cell[2];
            if (row == rows - 1 && col == cols - 1) {
                return effort;
            }
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {

                    int newEffort = Math.max(effort, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    if (newEffort < minEfforts[newRow][newCol]) {
                        minEfforts[newRow][newCol] = newEffort;
                        minHeap.offer(new int[]{newRow, newCol, newEffort});
                    }
                }
            }
        }
        return -1;
    }
}