class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                if(map.get(i) >=2){
                    size--;
                }else{
                    map.put(i,map.get(i)+1);
                }
            }
            else{
                map.put(i,1);
            }
        }
        
        int i=0;
        System.out.println(map);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            for(int j=0;j<entry.getValue();j++){
                nums[i] = entry.getKey();
                i++;
            }
        }
        return size;
    }
}