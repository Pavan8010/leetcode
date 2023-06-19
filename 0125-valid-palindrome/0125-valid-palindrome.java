class Solution {
    public boolean isPalindrome(String str) {
        int start=0,end=str.length()-1;
        while(start<=end){
            char s = str.charAt(start);
            char e = str.charAt(end);
            if(!Character.isLetterOrDigit(s)) start++;
            else if(!Character.isLetterOrDigit(e)) end--;
            else{
                if(Character.toLowerCase(s) != Character.toLowerCase(e)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}