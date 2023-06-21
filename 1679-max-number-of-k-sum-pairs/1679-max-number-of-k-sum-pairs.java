class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int x:nums){
            if(map.containsKey(k-x) && map.get(k-x)>0){
                cnt++;
                map.put(k-x,map.get(k-x)-1);
            }else{
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        return cnt;
    }
}