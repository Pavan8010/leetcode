class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        permutation(nums,new ArrayList());
        return ans;
    }
    void permutation(int[] nums,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int num : nums){
            if(!curr.contains(num)){
                curr.add(num);
                permutation(nums,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}