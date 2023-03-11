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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
    TreeNode insert(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;   
        }
        if(root.val > val){
            root.left = insert(root.left,val);
        }else if(root.val < val){
            root.right = insert(root.right,val);
        }
       return root; 
    }
}