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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
    TreeNode delete(TreeNode root,int k){
        if(root == null){
            return null;
        }
        if(root.val>k){
            root.left = delete(root.left,k);
        }
        else if(root.val<k){
            root.right = delete(root.right,k);
        }
        else{
            //case-1 ----> if root if leaf
            if(root.left == null && root.right==null){
                return null;
            }
            // case-2 -----> only one child present
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case-3 -----> both child present...so we find its ionrder suceesor in right-sub-tree and then replacr it
            TreeNode IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right,IS.val);
        }
        return root;
    }
    TreeNode inorderSuccessor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}