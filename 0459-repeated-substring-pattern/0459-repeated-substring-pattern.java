class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String sub = s.substring(0,i);
                StringBuilder check = new StringBuilder();
                for(int j=0;j<(n/i);j++){
                    check.append(sub);
                }
                // System.out.println(sub+" "+check.toString());
                if(check.toString().equals(s))return true;
            }
        }
        return false;
    }
}
