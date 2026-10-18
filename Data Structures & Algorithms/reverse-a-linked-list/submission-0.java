/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current.next != null) {
           stack.push(current); // issue: does it still have pointers to next node?
           current = current.next;
        }
        ListNode ans = current, tail = ans; // use dummy head?
        // instaed of a stack use a dummy head?
        
        while (!stack.isEmpty()) {
            tail.next = stack.pop();
            tail = tail.next;
        }
        tail.next = null;
        return ans;
    }
}
