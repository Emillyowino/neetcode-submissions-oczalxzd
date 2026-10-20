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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null; // both null
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // merge
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode ans = null;

        if (pointer2.val <= pointer1.val) {
            ans = list2;
            pointer2 = pointer2.next;
        } else {
            ans = list1;
            pointer1 = pointer1.next;
        }

        ListNode pointer3 = ans;
        while (pointer2 != null) {
            if (pointer1 != null) {
                if (pointer2.val <= pointer1.val) { // stays same
                    ans.next = pointer2;
                    pointer2 = pointer2.next;
                } else {
                    ans.next = pointer1;
                    pointer1 = pointer1.next;
                }
                ans = ans.next;
            } else {
                ans.next = pointer2;
                break;
            }
        } 
        if (pointer2 == null && pointer1 != null) ans.next = pointer1;

        return pointer3;



       /*  if (list1 == null) return list2; //list1 - empty
        if (list2 == null) return list1; //list2 - empty
        List list = new ListNode();
        while (list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1 < val2) {
                list.next = new ListNode(val1);
                list1 = list1.next;
            } else if (val2 < val1) {
                list.next = new ListNode(val2);
                list2 = list2.next;
            } else {
                list.next = new ListNode(val1);
                list.next.next = new ListNode(val2);
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if (list1 == null && list2 == null) {
            return list;
        } else if (list1 == null) {
            list.next = list2;
        } else {
            list.next = list1;
        }
        return list; */
    }
}