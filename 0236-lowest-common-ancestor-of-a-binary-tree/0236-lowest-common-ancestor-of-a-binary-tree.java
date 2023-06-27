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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // int small = Math.min(p.val,q.val);//4
        // int large = Math.max(p.val,q.val);//5
        // while(root != null){
        //     if(root.val>large){
        //         root = root.right;
        //     }else if(root.val < small){
        //         root = root.left;
        //     }else{
        //         return root;
        //     }
        // }
        // return null;
        return lca(root,p,q);
    }
    TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q){
            return root;
        }

        TreeNode left = lca(root.left,p,q);
        TreeNode right = lca(root.right,p,q);
        if(left==null)return right;
        else if(right==null)return left;
        else return root;
    }
}