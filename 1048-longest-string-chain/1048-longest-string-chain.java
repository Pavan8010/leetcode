class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Map<String,Integer> map = new HashMap<>();
        int ans=0;
        for(String word:words){
            int cnt=0;
            for(int i=0;i<word.length();i++){
                StringBuilder str = new StringBuilder(word);
                str.deleteCharAt(i);
                String tmp = str.toString();
                cnt=Math.max(cnt,map.getOrDefault(tmp,0)+1);
            }
            map.put(word,cnt);
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}