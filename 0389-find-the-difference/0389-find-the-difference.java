class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch))return ch;
            if(map.get(ch)>1){
                map.put(ch,map.get(ch)-1);
            }else{
                map.remove(ch);
            }
        }
        return '0';
    }
}