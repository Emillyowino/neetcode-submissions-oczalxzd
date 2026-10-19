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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        TreeNode current = root;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(current);
        
        int count = 0;
        while (!queue.isEmpty()) { // bfs
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            count += 1;
        }
        return count;
    }
}
