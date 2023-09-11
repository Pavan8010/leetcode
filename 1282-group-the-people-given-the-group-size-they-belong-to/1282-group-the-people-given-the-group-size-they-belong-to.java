class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap();
        for(int i=0;i<groupSizes.length;i++){
            int t = groupSizes[i];
            if(map.containsKey(t)){
                List<Integer> list = map.get(t);
                list.add(i);
                map.put(t,list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(t,list);
            }
        }
        // System.out.println(map);
        for(int size:map.keySet()){
            List<Integer> list = map.get(size);
            if(list.size()==size){
                ans.add(list);
            }else{
                int n = list.size()/size;
                for(int i=0;i<list.size();i+=size){
                    List<Integer> tmp = new ArrayList<>();
                    for(int j=i;j<i+size;j++){
                        tmp.add(list.get(j));
                    }
                    ans.add(tmp);
                }
            }
        }
        return ans;
    }
}