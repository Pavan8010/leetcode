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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        inorder(root,nodes);
        int n = nodes.size();
        return buildTree(nodes,0,n-1,root);
    }
    TreeNode buildTree(ArrayList<Integer> nodes,int start,int end,TreeNode root){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        root = new TreeNode(nodes.get(mid));
        root.left = buildTree(nodes,start,mid-1,root);
        root.right = buildTree(nodes,mid+1,end,root);
        return root;

    }
    void inorder(TreeNode root,ArrayList<Integer> nodes){
        if(root == null){
            return;
        }
        inorder(root.left,nodes);
        nodes.add(root.val);
        inorder(root.right,nodes);
    }
}