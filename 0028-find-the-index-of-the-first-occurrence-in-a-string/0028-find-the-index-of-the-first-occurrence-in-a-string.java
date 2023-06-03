class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        for(int i=needle.length();i<=haystack.length();i++){
            if(needle.equals(haystack.substring(j,i))){
                return j;
            }
            j++;
        }
        return -1;
    }
}