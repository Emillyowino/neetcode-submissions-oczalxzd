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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(current);
        while (!stack.isEmpty()) {
            current = stack.pop();
            TreeNode right = null;
            TreeNode left = null;
            if (current.right != null) {
                right = current.right;
                stack.push(right);
            }
            if (current.left != null) {
                left = current.left;
                stack.push(left);
            }
            current.left = right; // null pointer exception?
            current.right = left;
        }
        return root;
    }
}
