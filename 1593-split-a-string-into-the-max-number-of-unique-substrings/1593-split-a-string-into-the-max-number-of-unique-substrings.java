class Solution {
    int max = Integer.MIN_VALUE;
    public int maxUniqueSplit(String s) {
        HashSet<String> hs = new HashSet<>();
        helper(0,s,hs);
        return max;
    }
    void helper(int idx,String s,HashSet<String> hs){
        if(idx==s.length()){
            max = Math.max(max,hs.size());
            return;
        }
        for(int i=idx;i<s.length();i++){
            String str = s.substring(idx,i+1);
            if(!hs.contains(str)){
                hs.add(str);
                helper(i+1,s,hs);
                hs.remove(str);
            }
        }
    }
}