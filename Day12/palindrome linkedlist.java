
public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;

    // Step 1: Find middle
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse second half
    ListNode secondHalf = reverse(slow);

    // Step 3: Compare halves
    ListNode firstHalf = head;
    ListNode temp = secondHalf; // To restore later if needed
    boolean isPalin = true;
    while (secondHalf != null) {
        if (firstHalf.val != secondHalf.val) {
            isPalin = false;
            break;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    // Step 4: Optional - restore list
    reverse(temp);

    return isPalin;
}

private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode nextNode = head.next;
        head.next = prev;
        prev = head;
        head = nextNode;
    }
    return prev;
}
