class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int temp = countFreq(nums,n);
        return temp;
    }
    static int countFreq(int arr[], int n){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            // System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getValue()>1){
                int p = entry.getValue();
                int q = p * (p-1)/2;
                ans = ans + q;
            }
        }
        return ans;
    }
}