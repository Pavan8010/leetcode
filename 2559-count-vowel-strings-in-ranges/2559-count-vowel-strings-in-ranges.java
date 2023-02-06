class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[words.length];
        for(int i=0;i<words.length;i++){
            arr[i] = isvowel(words[i]);
        }
        int[] ans = new int[queries.length];
        for(int i=0;i < queries.length;i++){
            int sum = 0;
            int x = queries[i][0];
            int y = queries[i][1];
            for(int j=x;j<=y;j++){
                sum += arr[j];
            }
            ans[i]=sum;
        } 
        return ans; 
    }
    public int isvowel(String s){
    char f = s.charAt(0);
    char l = s.charAt(s.length()-1);
    if((f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') && (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')){
            return 1;
        }
        return 0;
    }
}