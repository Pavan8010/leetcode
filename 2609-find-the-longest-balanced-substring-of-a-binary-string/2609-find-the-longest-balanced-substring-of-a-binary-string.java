class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        String temp = "01";
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.contains(temp)){
                res = temp.length();
                temp = "0" + temp + "1";
            }
        }
        return res;
    }
}