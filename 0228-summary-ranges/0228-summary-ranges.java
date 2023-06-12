class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<nums.length;){
            String temp = ""; 
            temp += ""+nums[i];
            boolean flag = false;
            // if(i==nums.length){
            //     while(nums[i-1]-nums[i-2]==1){
            //         i++;
                    
            //     }
            // }else{
                while(i<nums.length-1 && nums[i+1]-nums[i]==1){
                    flag = true;
                    i++;
                }
            // }
            if(flag){
                temp = temp+"->"+nums[i];
            }
            ans.add(temp);
            i++;
            System.out.println(i+ " " + temp);
        }
        return ans;
    }
}
// 0 1 2 