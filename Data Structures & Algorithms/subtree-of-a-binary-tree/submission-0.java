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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // find the first occurrence then check if its a subtree i.e prev implementation - differ return false??
        // we check if equal when we encounter nodes of same values i.e. same root
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;

        if (tree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean tree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // both r null
        if (p == null || q == null) return false; // one is null the other is not

        if (p.val != q.val) return false; // val not identical
        return tree(p.left, q.left) && tree(p.right, q.right);
    }
}
