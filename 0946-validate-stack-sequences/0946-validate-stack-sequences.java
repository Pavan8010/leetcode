class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        Stack<Integer> st = new Stack<>();
        for(i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }   
        }    
        return st.isEmpty();
    }
}