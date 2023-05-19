class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>0){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}