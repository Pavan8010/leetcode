class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int left = triangle.get(i-1).get(j-1);
                    int right = triangle.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}