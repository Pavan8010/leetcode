class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int size = n-k+1;
        int ans[] = new int[size];
        int j=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(dq.size()>0 && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(dq.size()>0 && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[j++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}