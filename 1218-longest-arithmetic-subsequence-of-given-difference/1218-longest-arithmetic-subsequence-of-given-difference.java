class Solution {
    public int longestSubsequence(int[] arr, int d) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(arr[0],1);
        int ans=0;
        for(int i=1;i<arr.length;i++){
            int temp = arr[i]-d;
            
            if(map.containsKey(temp)){
                map.put(arr[i],map.get(temp)+1);
            }else{
                map.put(arr[i],1);
            }
            ans = Math.max(ans,map.get(arr[i]));
        }
        return ans;
    }
}