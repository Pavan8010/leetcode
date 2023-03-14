class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeaf(root, targetSum, sum);
    }
    public boolean rootToLeaf(TreeNode root, int target, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            sum = sum + root.val;
            if(sum == target)
                return true;   
        }
        return rootToLeaf(root.left,target,sum+root.val)||rootToLeaf(root.right, target,sum+root.val);
    }
}