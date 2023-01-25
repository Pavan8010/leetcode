class Solution {
    public int maxRotateFunction(int[] nums) {
      int sum=0;
      int f=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
          sum+=nums[i];
          f += i*nums[i];
      }  
      int max=f;
      for(int i=n-1;i>0;i--){
          max=Math.max(max,f + sum - ( n * nums[i]));
          f=f+sum-(n*nums[i]);
      }
      return max;
    }
}

// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int max = helper(nums);
//         for(int i=1;i<nums.length;i++){
//             nums = rotate(nums);
//             int temp = helper(nums);
//             if(temp>max){
//                 max = temp;
//             }
//         }
//         return max;
//     }
//     public int[] rotate(int[] arr){
//         int temp = arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1] = temp;
//         return arr;
//     }
//     public int helper(int arr[]){
//         int ans = 0;
//         for(int i=0;i<arr.length;i++){
//             ans += i*arr[i];
//         }
//         return ans;
//     }
// }