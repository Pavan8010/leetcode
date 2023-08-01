class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList();
        if(digits.length()==0)return ans;
        Map<String,String> map = new HashMap();
        map.put("2","abc");map.put("3","def");map.put("4","ghi");map.put("5","jkl");
        map.put("6","mno");map.put("7","pqrs");map.put("8","tuv");map.put("9","wxyz");

        Deque<String> deque = new ArrayDeque();
        deque.add(""); 
        
        for(int i=0;i<digits.length();i++){//23
            // String temp = digits.substring(i,i+1);
            String temp = digits.charAt(i)+""; //2
            String str = map.get(temp);//abc
            int n = deque.size();//1
            for(int j=0;j<n;j++){
                String tmp = deque.pollFirst();//[]
                for(int k=0;k<str.length();k++){
                    // String t = tmp.concat(str.charAt(k)+"");
                    // deque.add(t);
                    deque.add(tmp+str.charAt(k));
                }
            }
        }
        while(!deque.isEmpty()){
            ans.add(deque.poll());
        }
        return ans;
    }
}