class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0) st.push(arr[i]);
            else{
                while(!st.empty() && st.peek()>0 && st.peek()<(-arr[i])) 
                    st.pop();
                
                int stone = -arr[i];
                if(!st.isEmpty() && st.peek() == stone) st.pop();
                else if(!st.isEmpty() && st.peek()>stone)continue;
                else st.push(arr[i]);
            }
        }
        n = st.size();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}