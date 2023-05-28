class Solution {
   public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        String[] arr = path.split("/");
        for (String dir : arr) {
            if (dir.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if (!skip.contains(dir)){
                stack.push(dir);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.insert(0,stack.pop()).insert(0,"/");
        }
        if(res.isEmpty()){
            return "/";
        }
        return res.toString();
    }
}