class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>(); 
        List<Integer> list = new ArrayList<>(); 
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i--){
            int temp = list.get(i);
            char ch = 'a';
            for(Map.Entry<Character,Integer> entry : map.entrySet()) {
                if(entry.getValue().equals(temp)) {
                    ch = entry.getKey();
                }
            }
            for(int j = 0; j < temp; j++){
                sb.append(ch);
            }
            map.remove(ch);
        }
        return sb.toString();

    }
}