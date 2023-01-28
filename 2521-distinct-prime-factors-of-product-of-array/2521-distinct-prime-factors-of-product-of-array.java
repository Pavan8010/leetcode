class Solution {
    public int distinctPrimeFactors(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            int i=2;
            while(num>1){
                if(num % i == 0){
                    if(! list.contains(i)){
                        list.add(i);
                    }
                    num = num / i;
                }else{
                    i++;
                }
            }
        }
        return list.size();
    }
}