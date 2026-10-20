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
        // if in the same path - the earliest one is the ancestor
        // if not in same path - point at which they branch to different subtrees

        // we can follow path to tree - check path to say p then path to q
        // 3 traversals in the same graph; 1 to find the path to p 

        TreeNode current = root;
        List<Integer> pathp = new ArrayList<>();
        while (current != null) {
            pathp.add(current.val);
            if (p.val < current.val) { // going left
                current = current.left;
            } else if (p.val > current.val) {
                current = current.right;
            } else { // equal value
                pathp.add(current.val);
                break;
            }
        }

        current = root;
        TreeNode ans = null;
        while (current != null) {
            if (pathp.contains(current.val)) {
                ans = current;
            }
            if (q.val < current.val) { // going left
                current = current.left;
            } else if (q.val > current.val) {
                current = current.right;
            } else { // equal value
                break;
            }
        }
        return ans;
        










       /*  TreeNode ancestor = root; // what we are returning
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

        return ancestor; */
    }
}
