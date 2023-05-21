class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        // String ans = "";
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(str[i] != ""){
                sb.append(str[i]);
                sb.append(" ");
                // ans += str[i];
            }           
            // if(i != 0){
            //     ans += " ";
            // }
        }
        sb.setLength(sb.length()-1);
        // return ans;
        return sb.toString();
    }
}