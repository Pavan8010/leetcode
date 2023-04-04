class Solution {
    public int partitionString(String s) {
        int ans = 1;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(list.contains(ch)){
                ans++;
                // System.out.println(list);
                list.clear();
            }
            list.add(ch);
        }
        return ans;
    }
}