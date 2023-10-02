class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        if(n<3)return false;
        int a=0,b=0;
        for(int i=0;i<n;){
            int tmp=0;
            if(colors.charAt(i)=='A'){
                tmp++;
                i++;
                while(i<n && colors.charAt(i)=='A'){
                    tmp++;
                    i++;
                }
                if(tmp>2){
                    a += (tmp-2);
                }
            }else{
                tmp++;
                i++;
                while(i<n && colors.charAt(i)=='B'){
                    tmp++;
                    i++;
                }
                if(tmp>2){
                    b += (tmp-2);
                }
            }
        }
        // System.out.println(a+" "+b);
        return a>b ? true:false;
    }
}