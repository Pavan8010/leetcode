class Solution {
    public String removeStars(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                // st.push(ch);
                list.add(ch);
            }else{
                list.remove(list.size()-1);
            }
        }
        String str = "";
        while(!list.isEmpty()){
            char chs = list.get(0);
            str += chs;
            list.remove(0);
        }
        return str;
    }
}