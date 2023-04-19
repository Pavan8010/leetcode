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
    int ans = 0;
    public int longestZigZag(TreeNode root) {
        if(root==null)return -1;
        ans=0;
        helper(root.right,true,1);
        helper(root.left,false,1);
        return ans;
    }
    void helper(TreeNode root,boolean flag,int sum){
        if (root == null){
            return;
        }   
        ans = Math.max(ans, sum);
        if(flag){
            helper(root.left,false,sum+1);
            helper(root.right,true,1);

        }else{
            helper(root.right,true,sum+1);
            helper(root.left,false,1);
        }
    }
}