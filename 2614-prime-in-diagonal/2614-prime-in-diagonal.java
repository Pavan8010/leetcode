class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][i])){
                max=Math.max(max,nums[i][i]);
            }
        }
        for(int i=0;i<n;i++){
            if(isPrime(nums[n-1-i][i])){
                max=Math.max(max,nums[n-1-i][i]);
            }
        }
        return max;
    }
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}