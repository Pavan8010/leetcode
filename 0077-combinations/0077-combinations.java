class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList();
        generateSubset(1,n,new ArrayList(),subsets,k);
        return subsets;
    }
    void generateSubset(int start,int n,List<Integer> curr,List<List<Integer>> subsets,int k){
        if(curr.size()==k){
            subsets.add(new ArrayList(curr));
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            generateSubset(i+1,n,curr,subsets,k);
            curr.remove(curr.size()-1);
        }
    }
}