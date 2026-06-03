/**
 * 17 — Linked list (LeetCode ListNode pattern)
 *
 * ListNode: value + next pointer
 * Traverse: while (node != null) { node = node.next; }
 *
 * Practice problems: reverse list, merge two lists, cycle detection
 */
class LinkedListNodeBasics {

    public static void main(String[] args) {
        ListNode head = buildList(new int[] { 1, 2, 3, 4, 5 });
        printList(head);
        printList(reverse(head));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(" -> ");
            }
            head = head.next;
        }
        System.out.println(sb);
    }

    /** Iterative reverse — O(n) time, O(1) extra space */
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
