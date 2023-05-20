class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
        
            char[] charr = str.toCharArray();
            Arrays.sort(charr);
        
            String temp = new String(charr);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(str);
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> temp :map.values()){
            ans.add(temp);
        }
        return ans;
    }
}