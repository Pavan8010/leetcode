class Solution {
    Map<String, Integer> map = new LinkedHashMap<>();
    // HashMap<String,Integer> map = new HashMap<>();
    public List<String> topKFrequent(String[] words, int k) {

    for(String str : words){
        map.put(str,map.getOrDefault(str,0)+1);
    }

    sortMap();
    
    List<String> ans = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()){ 
        if(k-->0){
            ans.add(entry.getKey());
        }else{
            break;
        }
    }
    return ans;
}
    
    public void sortMap(){
        List<Map.Entry<String, Integer>> sorted = new LinkedList<>(map.entrySet());
        Collections.sort(sorted, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if(a.getValue() == b.getValue())
                    return a.getKey().compareTo(b.getKey());
                return b.getValue() - a.getValue();
            }
        });
        map.clear();
        for(Map.Entry<String, Integer> e: sorted)
            map.put(e.getKey(), e.getValue());
    }
}