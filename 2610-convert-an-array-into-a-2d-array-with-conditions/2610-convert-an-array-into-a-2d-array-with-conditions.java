class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arr = new int[201];
        for(int i:nums){
            arr[i]++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        while(true){
            List<Integer> temp = new ArrayList<>();
            int cnt = 0;
            for(int i=0;i<201;i++){
                if(arr[i]>0){
                    temp.add(i);
                    arr[i] -=1;
                }
                else{
                    cnt++;
                }
            }
            if(cnt==201){
                break;
            }
            ans.add(temp);
        }
        return ans;
    }
}