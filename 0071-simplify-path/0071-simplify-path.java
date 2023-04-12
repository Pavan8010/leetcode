class Solution {
   public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
    for (String dir : path.split("/")) {
        if (dir.equals("..") && !stack.isEmpty())
            stack.pop();
        else if (!skip.contains(dir))
            stack.push(dir);
    }
    StringBuilder res = new StringBuilder();
    while(!stack.isEmpty()){
        res.insert(0,stack.pop()).insert(0,"/");
    }
    return res.isEmpty() ? "/" : res.toString();
    }
}
        // String[] str = path.split("/");
        // // String ans = "/";
        // StringBuilder ans = new StringBuilder();
        // ans.append("/");
        // String dot = ".",ddot = "..";
        // int n = str.length;
        // for(int i=0;i<n;i++){
        //     String s = str[i];
        //     if(s.equals(dot) || s.equals(ddot)){
        //         continue;
        //     }
        //     ans.append(s);
        //     ans.append("/");
        //     // if(i != n-1){
        //     //     // ans += "/";
        //     // }
        // }
        // ans.deleteCharAt(ans.length()-1);
        // return ans.toString();