class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> result = new ArrayList<>();
    
    Set<String> dict = new HashSet<>(Arrays.asList(words));
    Set <String> formedWords = new HashSet<>();
    
    for(String word:words){
        if(canbeFormed(word,dict,formedWords)){
            result.add(word);
        }
    }
    return result; 
}

    public boolean canbeFormed(String s,Set<String> dict,Set <String> formedWords){
        if(formedWords.contains(s)) return true;

        for(int i = 1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            if(dict.contains(s1)){
                if(dict.contains(s2) || canbeFormed(s2,dict,formedWords)) {
                    formedWords.add(s);
                    return true;
                }
            }
        }
        return false;
    }   
}