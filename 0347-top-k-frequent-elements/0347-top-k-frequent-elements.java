class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        int[] ans = new int[k];
        int len = list.size()-1;
        while(k != 0){
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                if(list.get(len) == entry.getValue()){
                    ans[k-1] = entry.getKey();
                    map.remove(entry.getKey());
                    k--;
                    len--;
                    break;
                }
            }
        }
        return ans;
    }
}