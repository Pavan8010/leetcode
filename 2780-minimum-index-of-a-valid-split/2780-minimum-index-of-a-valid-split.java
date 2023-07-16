class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.size();
        int dom = -1;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            // if(map.get(num) > 2*n){
            //     dom = num;
            // }
        }
        for(int i=0;i<n;i++){
            if(map.get(nums.get(i)) * 2 > n){
                dom = nums.get(i);
                break;
            }
        }
        int[] cnt = new int[n];
        if(nums.get(0)==dom)cnt[0]=1;
        for(int i=1;i<n;i++){
            if(nums.get(i)==dom)cnt[i] = cnt[i-1]+1;
            else cnt[i] = cnt[i-1];
        }
        
        int maxCnt = cnt[n-1];
        for(int i=0;i<n;i++){
            if(cnt[i]*2 > i+1 && (maxCnt-cnt[i])*2 >n-i-1){
                return i;
            }
        }
        return -1;
    }
}