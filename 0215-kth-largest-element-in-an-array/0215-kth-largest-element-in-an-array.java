class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i  : nums) pq.add(i);
        for(int i=0;i<k-1;i++) pq.remove();
        return pq.peek();
        
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i] * -1;
        // }
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i] * -1;
        // }
        // return nums[k-1];
    }
}