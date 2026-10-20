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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // recursion
        if (p == null && q == null) return true;
        if (p == null && q != null || p != null && q == null) return false;

        // both not null
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);



       /*  if (p == null && q == null) return true; // both null
        if (p == null && q != null || p != null && q == null) return false;
        // bfs
        Queue<TreeNode> queuep = new ArrayDeque<>();
        Queue<TreeNode> queueq = new ArrayDeque<>();
        queuep.offer(p);
        queueq.offer(q);

        while(!queuep.isEmpty()) {
            int size = queuep.size();
            if (size != queueq.size()) return false;
      
            for (int i = 0; i < size; i++) {
                TreeNode currentp = queuep.poll();
                TreeNode currentq = queueq.poll();
                if (currentp.val != currentq.val) return false;
                if (currentp.right != null && currentq.right != null) {
                    queuep.offer(currentp.right);
                    queueq.offer(currentq.right);
                } else if ((currentp.right == null && currentq.right != null) || (currentp.right != null && currentq.right == null)) {
                    return false;
                }

                if (currentp.left != null && currentq.left != null) {
                    queuep.offer(currentp.left);
                    queueq.offer(currentq.left);
                } else if ((currentp.left == null && currentq.left != null) || (currentp.left != null && currentq.left == null)) {
                    return false;
                }
                
            }
        }
        return true; */
    }
}
