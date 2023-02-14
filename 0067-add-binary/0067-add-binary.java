class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        String ans = "";
        int carry = 0, temp=0;
        while(l1>=0 || l2>=0){
            temp = carry;
            if(l1>=0){
                temp += a.charAt(l1) - '0';
            }
            if(l2>=0){
                temp += b.charAt(l2) - '0';
            }
            ans += Integer.toString(temp%2);
            carry = temp/2;
            l1--;
            l2--;
        }
        if(carry == 1){
            ans += '1';
        }
        String rev = new StringBuilder(ans).reverse().toString();
        return rev;
    }
}