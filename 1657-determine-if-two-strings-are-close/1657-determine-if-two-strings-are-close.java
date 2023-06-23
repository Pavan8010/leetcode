class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        return check(word1,word2);
    }
    boolean check(String s1,String s2){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch: s2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(!map.containsKey(ch))return false;
        }

        ArrayList<Integer> a = new ArrayList(map.values());
        ArrayList<Integer> b = new ArrayList(map2.values());
        Collections.sort(a);
        Collections.sort(b);

        return a.equals(b);
    }
}