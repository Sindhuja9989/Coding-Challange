
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c = 0, c1 = 0;
        ListNode temp = headA;
        ListNode temp1 = headB;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        while (temp1 != null) {
            c1++;
            temp1 = temp1.next;
        }
        int diff = Math.abs(c - c1);
        temp = headA;
        temp1 = headB;
        if (c > c1) {
            while (diff-- > 0) {
                temp = temp.next;
            }
        }
        if (c < c1) {
            while (diff-- > 0) {
                temp1 = temp1.next;
            }
        }
        while (temp != null && temp1 != null) {
            if (temp == temp1) {
                return temp;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return temp;
    }
}
