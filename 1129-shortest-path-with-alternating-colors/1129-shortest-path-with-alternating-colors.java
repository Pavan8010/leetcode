class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer, List<Integer>> redGraph = new HashMap<>();
        Map<Integer, List<Integer>> blueGraph = new HashMap<>();
        int[] paths = new int[n];
        Arrays.fill(paths, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            redGraph.put(i, new ArrayList<>());
            blueGraph.put(i, new ArrayList<>());
        }
        // Graph initialization
        for (int[] redEdge : redEdges) {
            int parent = redEdge[0];
            int child = redEdge[1];
            redGraph.get(parent).add(child);
        }
        for (int[] blueEdge : blueEdges) {
            int parent = blueEdge[0];
            int child = blueEdge[1];
            blueGraph.get(parent).add(child);
        }
        
        int steps = 0;
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        // pair of node and current color edge taken to arrive
        q.add(new Pair(0, 0));
        q.add(new Pair(0, 1));
        Set<Pair<Integer, Integer>> seen = new HashSet<>();
        // Perform BFS starting from 0th node. Add two pairs since we have simulate starting from red or blue edge
        // since bfs finds the shortest path, update the steps taken so far when arriving at any node
        // Each step add neighboring nodes from the opposite color
        // Maintain a seen set to ensure we dont visit a node we have seen already
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair<Integer, Integer> cur = q.poll();
                seen.add(cur);
                int curNode = cur.getKey();
                int color = cur.getValue();
                if (color == 0) {
                    paths[curNode] = Math.min(paths[curNode], steps);
                    for (int blueEdgeChild : blueGraph.get(curNode)) {
                        Pair<Integer, Integer> childPair = new Pair(blueEdgeChild, 1);
                        if (!seen.contains(childPair))
                            q.add(childPair);
                    }
                } else {
                    paths[curNode] = Math.min(paths[curNode], steps);
                    for (int redEdgeChild : redGraph.get(curNode)) {
                        Pair<Integer, Integer> childPair = new Pair(redEdgeChild, 0);
                        if (!seen.contains(childPair))
                            q.add(childPair);
                    }
                }
            }
            steps++;
        }
        for (int i = 0; i < paths.length; i++) {
            if (paths[i] == Integer.MAX_VALUE) {
                paths[i] = -1;
            }
        }
        return paths;
    }
}