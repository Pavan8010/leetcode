class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList();
        int[] arr = new int[26];
        for(char ch:p.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            String str = s.substring(i,i+p.length());
            int[] tmp = new int[26];
            for(char ch:str.toCharArray()){
                tmp[ch-'a']++;
            }
            if(Arrays.equals(arr,tmp)){
                ans.add(i);
            }
        }
        return ans;
    }
}