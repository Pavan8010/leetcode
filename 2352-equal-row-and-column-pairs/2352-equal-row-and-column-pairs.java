class Solution {
    public int equalPairs(int[][] grid) {
        int cnt=0;
        int n = grid.length;
        // List<List<Integer>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            // List<Integer> tmp = new ArrayList<>();
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++){
                String tmp = Integer.toString(grid[i][j]);
                str.append(tmp).append(".");
            }
            // System.out.println(tmp);
            map.put(str.toString(),map.getOrDefault(str.toString(),0)+1);
        }
        for(int i=0;i<n;i++){
            // List<Integer> tmp = new ArrayList<>();
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++){
                String tmp = Integer.toString(grid[j][i]);
                str.append(tmp).append(".");
            }
            // map.put(str.toString(),map.getOrDefault(str,0)+1);
            cnt += map.getOrDefault(str.toString(),0);
            // System.out.println(str.toString()+" "+cnt);
        }
        return cnt;
    }
}