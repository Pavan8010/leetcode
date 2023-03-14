/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> path = new ArrayList<>();
        RootToLeaf(root,path);
        return ans;
    }
    void RootToLeaf(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.val);
        if(root.left == null && root.right==null){
            int num = 0;
            for (int i: path){
                num = num*10 + i;
                // System.out.print(i + "->");
            }
            // System.out.println();
            ans += num;
            // num=0;
        }
        else {
            RootToLeaf(root.left,path);
            RootToLeaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
}