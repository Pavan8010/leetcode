class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        ArrayList<Integer> list = new ArrayList<>();

        while(left<=right && top<=bottom){
            
            for(int i = left;i<=right && top<=bottom;i++){
                int temp = matrix[top][i];
                list.add(temp);
            }
            top++;
            for(int i=top;i<=bottom && left<=right;i++){
                int temp = matrix[i][right];
                list.add(temp);
            }
            right--;
            for(int i=right;i>=left && top<=bottom;i--){
                int temp = matrix[bottom][i];
                list.add(temp);
            }
            bottom--;
            for(int i=bottom;i>=top && left<=right;i--){
                int temp = matrix[i][left];
                list.add(temp);
            }
            left++;
        }
        return list;
    }
}