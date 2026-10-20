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
        if (head == null) return false;

        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            } 
            set.add(head);
            head = head.next;
        }
        return false;



       /*  if (head == null) return false; // empty list

        ListNode tortoise = head;
        ListNode hare = head;
        if (head.next != null) {
            hare = head.next.next;
        } else {
            return false;
        }

        while (hare != null) {
            if (hare == tortoise) return true;
            hare = hare.next;
            tortoise = tortoise.next;
        }
        return false;

 */










       /*  ListNode hare = head;
        ListNode tortoise = head;
        ListNode current = head;
        if (head == null || head.next == null) { // has one item or none
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

        return false; */
    }
}
