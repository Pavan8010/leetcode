class Solution {
    public boolean buddyStrings(String s, String goal) {
        int cnt=0;
        char check1='a',check2='a';
        if(s.length()!=goal.length())return false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(cnt==0){
                    check1 = s.charAt(i);
                    check2 = goal.charAt(i);
                    cnt++;
                }else if(s.charAt(i)==check2 && goal.charAt(i)==check1){
                    cnt++;
                }
                else return false;
            }
        }
        if(cnt==0){
            Map<Character,Integer> map = new HashMap<>();
            for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)>1)return true;
            }
        }
 
        return cnt==2;
    }
}