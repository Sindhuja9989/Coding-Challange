
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        int i = 0;
        while (i < n - 1) {
            fast = fast.next;
            i++;
        }
        if (fast.next == null) {
            return head.next;
        }
        while (fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next;
        }
        temp.next = slow.next;
        return head;
    }
}
