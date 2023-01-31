class Solution {
    public int repeatedStringMatch(String a, String b) {
        String copy = "";
        int ans=0;
        while(copy.length()<b.length()){
            copy = copy+a;
            ans++;
        }
        if(copy.indexOf(b)>=0){
            return ans;
        }
        copy = copy+a;
        ans++;
        if(copy.indexOf(b)>=0){
            return ans;
        }
        return -1;
    }
}