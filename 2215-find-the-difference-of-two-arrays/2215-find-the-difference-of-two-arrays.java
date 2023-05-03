class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);

        for(int i=0; i<nums2.length; i++){
            if(set1.contains(nums2[i])){
                set1.remove(nums2[i]);
            }
        }

        for(int i=0; i<nums1.length; i++){
            if(set2.contains(nums1[i])){
                set2.remove(nums1[i]);
            }
        }

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        temp1.addAll(set1);
        temp2.addAll(set2);
        ans.add(temp1);
        ans.add(temp2);

        return ans;
    }
}