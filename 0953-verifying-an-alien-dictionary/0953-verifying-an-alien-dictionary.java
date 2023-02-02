class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        for(int i=1;i<words.length;i++){
            String a = words[i-1];
            String b = words[i];
            for(int j=0;j<a.length();j++){
                if(j==b.length()){
                    return false;
                }
                char cha = a.charAt(j);
                char chb = b.charAt(j); 
                if(map.get(cha)<map.get(chb)){
                    break;
                }
                if(map.get(cha)>map.get(chb)){
                    return false;
                }            
            }
        }
        return true;
    }
}