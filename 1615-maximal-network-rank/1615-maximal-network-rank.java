class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int ans = -1;
        Map<Integer,Set<Integer>> map = build(roads,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    ans = Math.max(map.get(i).size()+map.get(j).size()-(map.get(i).contains(j)?1:0),ans);
                    // if(map.get(i).contains(j))ans--;
                }
            }
        }
        return ans;
    }
    Map<Integer,Set<Integer>> build(int[][] roads,int n){
        Map<Integer,Set<Integer>> map = new HashMap();
        for(int i=0;i<n;i++){
            map.put(i,new HashSet<>());
        }
        for(int[] curr:roads){
            map.get(curr[0]).add(curr[1]);
            map.get(curr[1]).add(curr[0]);
        }
        return map;
    }
}

