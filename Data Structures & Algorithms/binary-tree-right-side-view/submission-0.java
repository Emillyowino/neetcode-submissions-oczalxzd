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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int currentQueueSize = size;
            for (int i = 0; i < size; i++, currentQueueSize--) { // traversing level wise
                TreeNode current = queue.remove();
                if (currentQueueSize == 1) {
                    list.add(current.val);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return list;
    }
}
