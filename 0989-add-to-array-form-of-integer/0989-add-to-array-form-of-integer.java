class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length -1;
        int carry = 0,sum=0;
        while(i>=0 || carry>0 || k>0){
            sum = carry;
            if(i>=0){
                sum += num[i];
                i--;
            }
            if(k>=0){
                sum += k%10;
                k = k/10;
            }
            carry = sum/10;
            list.add(sum%10);
        }
        Collections.reverse(list);
        return list;
        
    }
}