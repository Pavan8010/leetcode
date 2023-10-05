class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        int ele=nums[0];
        int count=0;
        int n=nums.length/3;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                count++;
                if(count>n && !ans.contains(ele))
                ans.add(ele);

            }

            else
            {
                
                ele=nums[i];
                count=1;
                if(count>n && !ans.contains(ele))
                ans.add(nums[i]);

            }
        }
        return ans;
    }
}