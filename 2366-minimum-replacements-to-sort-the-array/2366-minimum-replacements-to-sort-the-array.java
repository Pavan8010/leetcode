class Solution {
    public long minimumReplacement(int[] nums) {
        long ops=0;
        int n = nums.length;
        int prev = nums[n-1];
        for(int i=n-2;i>=0;i--){
            int num = nums[i];
            int no_ops = num/prev;
            if(num%prev!=0){
                no_ops++;
                prev = num/no_ops;
            }
            ops += no_ops-1;
        }
        return ops;
    }
}

// 3 7 2
// 3 5 2 2
// 3 3 2 2 2
// 3 1 2 2 2 2
// 2 1 1 2 2 2 2
// 1 1 1 1 2 2 2 2

// 3 5 3
// 3 2 3 3
// 1 2 2 3 3