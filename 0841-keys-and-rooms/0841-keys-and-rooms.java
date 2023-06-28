class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(0);

        for(int i : rooms.get(0)) q.add(i);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            visited[curr] = true;
            for(int i:rooms.get(curr)){
                if(!visited[i]){
                    q.add(i);
                }
            }
        }   
        for(boolean x:visited){
            if(!x) return false;
        }
        return true;
    }
}