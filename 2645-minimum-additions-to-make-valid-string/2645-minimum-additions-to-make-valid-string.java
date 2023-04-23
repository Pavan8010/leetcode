class Solution {
    public int addMinimum(String word) {
        int i=0,ans=0,len = word.length();
        while(i<len-1){
            char f = word.charAt(i);
            char s = word.charAt(i+1);
            if(f == 'a'){
                if(s == 'a'){
                    ans +=2;
                }else if(i<len-2 && s=='b' && word.charAt(i+2)=='c'){
                    i+=2;
                }else{
                    ans++;
                    i++;
                }
            }else if(f == 'b'){
                if(s=='c'){
                    ans++;
                    i++;
                }else{
                    ans+=2;
                }
            }else{
                ans+=2;
            }
            i++;
        }
        if(i<len)ans+=2;
        return ans;
    }
}