class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length,max=0;
        Map<Integer,Integer>[] diffs = new Map[n];
        
        for(int i=0;i<n;i++) diffs[i] = new HashMap<>();
        
        // System.out.println(diffs[0]+" "+max);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int d = nums[i]-nums[j];
                int tmp = Math.max
                        (
                            diffs[i].getOrDefault(d,0),
                            diffs[j].getOrDefault(d,1)+1
                        );
                diffs[i].put(d,tmp);
                
                max = Math.max(max,diffs[i].get(d));
            }
            // System.out.println(diffs[i] + " " + max);
        }
        
        return max;
    }
}