class Solution {
    public boolean canConstruct(String a, String magazine) {
        // ArrayList<Character> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            // list.add(magazine.charAt(i));
            char ch = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i)) && map.get(a.charAt(i))>0){
                map.put(a.charAt(i),map.get(a.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}