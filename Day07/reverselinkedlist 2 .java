
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        if (list.size() < 2) {
            return head;
        }

        while (left < right) {
            Collections.swap(list, left - 1, right - 1);
            left++;
            right--;
        }

        temp = head;
        for (int i = 0; i < list.size(); i++) {
            temp.val = list.get(i);
            temp = temp.next;
        }

        return head;

    }
}
