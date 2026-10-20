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
    public boolean isBalanced(TreeNode root) {
        // problem with my code; doent compare 2 nodes compares l and r subtree from the root - at each node, we need to check a depth of 2 on its left and right
        // get depth of left tree - compare to length of right subtree
        if (root == null) return true;

        TreeNode left = root.left;
        TreeNode right = root.right;

        int l = depth(left);
        int r = depth(right);

        if (!(l == r || l + 1 == r || l == r + 1)) return false;
        return isBalanced(root.right) && isBalanced(root.left);
    }

    private int depth(TreeNode temp) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (temp == null) return 0;
        queue.offer(temp);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            count++;
        }
        return count;
    }
}

