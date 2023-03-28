class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean isPalindrome = true;
        for(int i=2;i<=n-2;i++){
            if(!check(Integer.toString(n,i))){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    boolean check(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}