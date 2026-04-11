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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root; // what we are returning
        TreeNode current = root;
        List<TreeNode> listp = new ArrayList<>();
        listp.add(root);
        while (current != null) {
            if (p.val > current.val) { // going right
                current = current.right;
                listp.add(current);
            } else if (p.val < current.val) { // going left
                current = current.left;
                listp.add(current);
            } else { // equal
                listp.add(current);
                break;
            }
        }

        current = root;
        while (current != null) {
            if (q.val > current.val) { // going right
                current = current.right;
                if (listp.contains(current)) ancestor = current;
            } else if (q.val < current.val) { // going left
                current = current.left;
                if (listp.contains(current)) ancestor = current;
            } else { // equal
                if (listp.contains(current)) ancestor = current;
                break;
            }
        }   

        return ancestor;
    }
}
