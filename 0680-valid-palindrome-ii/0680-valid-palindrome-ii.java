class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 1) {
            return true;
        }
        int i = 0 , j = s.length()-1;
        
        while(i<j){
            char first = s.charAt(i);
            char second = s.charAt(j);
            if(first == second){
                i++;
                j--;
            }
            else{
                if(check(s,i,j-1)){
                    return true;
                }
                if(check(s,i+1,j)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    static boolean check(String str,int start,int end){
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}