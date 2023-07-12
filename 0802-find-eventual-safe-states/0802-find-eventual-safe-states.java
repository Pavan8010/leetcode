class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n =  graph.length;
        int[] visited = new int[n];
        for (int u = 0; u < n; u++){
            if (visited[u] == 0)
                dfs(u, graph, visited);
        }
        List<Integer> list = new ArrayList<>();
        for (int u = 0; u <  n; u++){
            if (visited[u] == 2)
                list.add(u);
        }
        return list;
    }

    private boolean dfs(int u, int[][] graph, int[] visited){
        visited[u] = 1;
        for (int v : graph[u]){
            if (visited[v] == 0){
                if (dfs(v, graph, visited))
                    return true;
            }
            if (visited[v] == 1){
                return true;
            }
        }
        visited[u] = 2;
        return false;
    }
}