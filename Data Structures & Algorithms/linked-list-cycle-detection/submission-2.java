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
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        ListNode current = head;
        if (head == null || head.next == null) { // has one item
            return false;
        }

        while (current.next != null) {
            tortoise = tortoise.next;
            if (hare.next != null) {
                if (hare.next.next != null) {
                    hare = hare.next.next;
                } else {
                    return false;
                }
                if (hare == tortoise) {
                    return true;
                }
                current = current.next;
            } else {
                return false;
            }
           
        }

        return false;
    }
}
