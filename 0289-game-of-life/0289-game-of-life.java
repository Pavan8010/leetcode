class Solution {
    public void gameOfLife(int[][] board) {
        // Get the number of rows and columns in the board
        int row = board.length;
        int col = board[0].length;
        
        // Create a temporary board to store the updated values
        int[][] temp = new int[row][col];
        
        // Iterate through each cell in the board
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                // Check the status of the current cell and update the temporary board accordingly
                if(check(board, i, j)){
                    temp[i][j] = 1; // Cell lives in the next generation
                } else {
                    temp[i][j] = 0; // Cell dies in the next generation
                }
            }
        }
        
        // Copy the values from the temporary board back to the original board
        for(int r=0; r<row; r++){
            board[r] = temp[r].clone();
        }
    }
    
    // Helper method to check the status of a cell
    boolean check(int b[][], int i, int j){
        int cnt = 0;
        
        // Check the neighboring cells in the previous generation
        
        // Upper row
        if(i > 0){
            if(j > 0){
                cnt += b[i-1][j-1]; // Upper-left neighbor
            }
            if(j < b[0].length-1){
                cnt += b[i-1][j+1]; // Upper-right neighbor
            }
            cnt += b[i-1][j]; // Upper neighbor
        }
        
        // Lower row
        if(i < b.length-1){
            if(j > 0){
                cnt += b[i+1][j-1]; // Lower-left neighbor
            }
            if(j < b[0].length-1){
                cnt += b[i+1][j+1]; // Lower-right neighbor
            }
            cnt += b[i+1][j]; // Lower neighbor
        }
        
        // Same row
        if(j > 0){
            cnt += b[i][j-1]; // Left neighbor
        }
        if(j < b[0].length-1){
            cnt += b[i][j+1]; // Right neighbor
        }
        
        // Check the current cell's status and return the result
        if(b[i][j] == 0){
            return cnt == 3; // Cell becomes alive if it has exactly 3 live neighbors
        }
        return cnt == 2 || cnt == 3; // Cell remains alive if it has 2 or 3 live neighbors, otherwise, it dies
    }
}
