class Solution {
    public int myAtoi(String s) {
        int i=0,sign=1,ans=0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='+'){
            i++;
        }else if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while(i<n && ((int)s.charAt(i)-'0')>=0 && ((int)s.charAt(i)-'0')<=9){
            if(ans>max/10 || (ans==max/10 && (int)(s.charAt(i)-'0')>max%10)){
                return (sign==1?max:min);
            }
            ans = ans*10;
            ans += (int)(s.charAt(i)-'0');
            i++;
        }
        return ans*sign;
    }
}