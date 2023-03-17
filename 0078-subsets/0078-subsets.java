class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         return subset(nums);
    }
    static List<List<Integer>> subset(int[] arr){
        
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}