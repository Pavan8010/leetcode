class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        Arrays.sort(numsDivide);
        int num = numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            num = gcd(numsDivide[i],num);
        }
        int cnt = 0;
        if(nums[0]>num)return -1;
        for(int i:nums){
            if(i>num){
                break;
            }
            if(num%i!=0){
                cnt++;
            }else{
                break;
            }    
        }
        if(cnt == nums.length) return -1;
        return cnt;
    }
    static int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}