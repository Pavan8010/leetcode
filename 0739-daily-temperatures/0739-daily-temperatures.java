class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for(int i=1;i<n;i++){
            int curr = temperatures[i];
            while(!st.isEmpty() && curr > temperatures[st.peek()]){
                int temp = st.pop();
                ans[temp] = i-temp;
            }
            st.push(i);
        }
        System.out.println(st);
        return ans;
    }
}
// 2 3 4 5 