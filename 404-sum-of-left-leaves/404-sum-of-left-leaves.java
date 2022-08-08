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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, -1);
        return sum;
    }
    
    public void dfs(TreeNode root, int val){
        if(root == null){
            return;
        }
        dfs(root.left, 0);
        dfs(root.right,1);
        if(root.left== null && root.right == null && val == 0){
            sum += root.val;
        }
    }
    
    
}