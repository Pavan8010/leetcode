class Solution {
    public boolean primeSubOperation(int[] nums) {
        int p = 0;
        for(int num:nums){
            if(num<=p){
                return false;
            }
            int prime = num - p - 1;
            while(prime>0 && !isPrime(prime)){
                prime--;
            }
            if(prime == 0){
                p = num;
            }else{
                p = num-prime;
            }
        }
        return true;
    }
    public boolean isPrime(int x) {
    if (x == 1) return false;
    for (int i = 2; i * i <= x; ++i) {
        if (x%i == 0) {
            return false;
        }
    }
    return true;
    }
}