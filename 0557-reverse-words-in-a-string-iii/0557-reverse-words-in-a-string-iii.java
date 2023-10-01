class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int start=0;
        int end=0;
        while(start<s.length()){
            while(end<s.length() && ch[end]!=' '){
                end++;
            }

            reverse(ch,start,end-1);
            start=end+1;
            end=start;
        }
        return new String(ch);
    }
    void reverse(char[] ch,int i,int j){
        while(i<j){
            char tmp = ch[i];
            ch[i]=ch[j];
            ch[j] = tmp;
            i++;
            j--;
        }
    }
}