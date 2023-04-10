class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>(); 
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.isEmpty()) return false;
                if(st.peek() != '(') return false;
                st.pop();
            }
            else if(ch == '}'){
                if(st.isEmpty()) return false;
                if(st.peek() != '{') return false;
                st.pop();
            }
            else if(ch == ']'){
                if(st.isEmpty()) return false;
                if(st.peek() != '[') return false;
                st.pop();
            }else{
                st.push(ch);
            }
        }
        if(st.isEmpty())return true;
        return false;
    }
}