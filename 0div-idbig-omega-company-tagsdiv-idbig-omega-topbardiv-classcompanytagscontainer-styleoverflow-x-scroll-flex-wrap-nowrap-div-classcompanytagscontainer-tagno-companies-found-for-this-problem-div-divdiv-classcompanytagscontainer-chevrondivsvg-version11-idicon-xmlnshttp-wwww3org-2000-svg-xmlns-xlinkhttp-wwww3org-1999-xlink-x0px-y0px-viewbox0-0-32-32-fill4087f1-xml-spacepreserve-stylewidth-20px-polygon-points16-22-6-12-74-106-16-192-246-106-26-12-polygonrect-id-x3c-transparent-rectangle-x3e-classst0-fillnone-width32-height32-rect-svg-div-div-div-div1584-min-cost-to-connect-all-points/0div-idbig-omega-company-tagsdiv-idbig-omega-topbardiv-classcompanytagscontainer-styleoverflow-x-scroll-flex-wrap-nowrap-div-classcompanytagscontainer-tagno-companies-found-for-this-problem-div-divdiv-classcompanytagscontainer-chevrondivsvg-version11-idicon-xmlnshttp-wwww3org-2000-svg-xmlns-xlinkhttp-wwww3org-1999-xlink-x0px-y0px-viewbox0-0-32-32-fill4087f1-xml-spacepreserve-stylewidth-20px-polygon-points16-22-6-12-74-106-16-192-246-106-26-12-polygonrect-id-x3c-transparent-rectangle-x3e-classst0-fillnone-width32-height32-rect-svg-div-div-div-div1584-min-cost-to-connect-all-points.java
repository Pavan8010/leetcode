class Pair{
    int node;
    int distance;
    Pair(int node,int distance){
        this.node = node;
        this.distance = distance;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {

        int n = points.length;        
        ArrayList<ArrayList<Pair>> adj_list = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj_list.add(new ArrayList<Pair>());
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int[] first = points[i];
                int[] second = points[j];
                int weight = Math.abs(first[0]-second[0]) + Math.abs(first[1]-second[1]);
                adj_list.get(i).add(new Pair(j,weight));
                adj_list.get(j).add(new Pair(i,weight));
            }
        }

        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        pq.add(new Pair(0,0));

        int sum = 0;


        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int node = pair.node;
            int dist = pair.distance;

            if(visited[node]==true) continue;

            visited[node] = true;
            sum += dist;

            for(Pair adj:adj_list.get(node)){
                int adj_node = adj.node;
                int adj_distance = adj.distance;

                if(visited[adj_node]==false){
                    pq.add(new Pair(adj_node,adj_distance));
                }

            }

        }

        return sum;
    }
}