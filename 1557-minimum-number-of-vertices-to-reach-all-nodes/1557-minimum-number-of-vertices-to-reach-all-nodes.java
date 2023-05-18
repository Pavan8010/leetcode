class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        // List<Integer> canReach = new ArrayList<>();
        int[] canReach = new int[n];
        for(List<Integer> curr: edges){
            canReach[curr.get(1)]++;
        }
        
        List<Integer> cannotReach = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(canReach[i]==0){
                cannotReach.add(i);
            }
        }
        return cannotReach;
    }
}