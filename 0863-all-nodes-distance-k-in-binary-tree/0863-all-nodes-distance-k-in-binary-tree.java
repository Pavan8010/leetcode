/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (k == 0) return Arrays.asList(target.val);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Map<TreeNode,TreeNode> map = new HashMap<>();
        findParent(root,map);
        
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        visited.add(target);
        
        while (!queue.isEmpty() && k > 0) {
            k--;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (map.containsKey(node) && !visited.contains(map.get(node))) {
                    queue.add(map.get(node));
                    visited.add(map.get(node));
                }
                if (!visited.contains(node.left) && node.left != null) {
                    queue.add(node.left);
                    visited.add(node.left);
                }
                if (!visited.contains(node.right) && node.right != null) {
                    queue.add(node.right);
                    visited.add(node.right);
                }
            }
            if (k == 0) {
                while(!queue.isEmpty()){
                    ans.add(queue.remove().val);
                }
            }
        }
        return ans;
    }
    void findParent(TreeNode root,Map<TreeNode,TreeNode> map){
        if(root==null)return;
        if(root.left!=null)map.put(root.left,root);
        if(root.right!=null)map.put(root.right,root);
        findParent(root.left,map);
        findParent(root.right,map);
    }
}