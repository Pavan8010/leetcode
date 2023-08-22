class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> map = new HashMap();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                ans += helper(map);
                //System.out.println(map+" "+ans);
            }
        }
        return ans;
    }
    int helper(Map<Character,Integer> map){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            min = Math.min(min,map.get(ch));
            max = Math.max(max,map.get(ch));
        }
        return max-min;
    }
}
//aabcb
