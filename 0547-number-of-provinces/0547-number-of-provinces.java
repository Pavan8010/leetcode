class Solution {
    boolean[] vis;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        vis = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(isConnected, i, vis);
                count++;
            }
        }
        return count;
    }

    private void bfs(int[][] isConnected, int v, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        vis[v] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < isConnected.length; i++) {
                if (isConnected[u][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
}