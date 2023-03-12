class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for(int i=left;i<=right;i++){
            if(isVowel(words[i])){
                ans++;
            }
        }
        return ans;
    }
    boolean isVowel(String str){
        int cnt=0;
        int n = str.length();
        if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
            cnt++;
        } 
        if(str.charAt(n-1) == 'a' || str.charAt(n-1) == 'e' || str.charAt(n-1) == 'i' || str.charAt(n-1) == 'o' || str.charAt(n-1) == 'u'){
            cnt++;
        }
        return cnt==2 ? true:false;
    }
}