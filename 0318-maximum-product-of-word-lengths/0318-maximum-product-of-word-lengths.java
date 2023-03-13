class Solution {
    public int maxProduct(String[] words) {
        int ans=0;
        int[][] map = new int[words.length][26];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(map[i][words[i].charAt(j)-'a']==0){
                    map[i][words[i].charAt(j)-'a']++;
                }
            } 
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(i,j,map)){
                    int temp = words[i].length()*words[j].length();
                    ans = Math.max(ans,temp);
                }
            }
        }
        return ans;
    }
    boolean check(int r1,int r2,int[][] map){
        for(int i=0;i<26;i++){
            if(map[r1][i]==1 && map[r2][i]==1){
                return false;
            }
        }
        return true;
    }
}