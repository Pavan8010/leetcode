class Solution {
    int min;
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i<roads.length; i++){
            graph.get(roads[i][0]-1).add(new int[]{roads[i][1]-1, roads[i][2]});
            graph.get(roads[i][1]-1).add(new int[]{roads[i][0]-1, roads[i][2]});
        }
        min = Integer.MAX_VALUE;
        boolean vis[] = new boolean[n];
        dfs(graph, vis, 0);
        if(vis[n-1]) return min;
        return -1;
    }
    private void dfs(ArrayList<ArrayList<int[]>> graph, boolean vis[], int s){
        if(vis[s]) return;
        vis[s] = true;
        for(int[] child : graph.get(s)){
            dfs(graph, vis, child[0]);
            min = Math.min(min, child[1]);
        }
    }
}