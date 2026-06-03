/**
 * 19 — Short practice after lessons 12–18 (try before peeking at solutions below)
 *
 * Run: ./run 19_DsaPractice.java
 */
class DsaPractice {

    public static void main(String[] args) {
        DsaPractice p = new DsaPractice();
        System.out.println("valid ()? " + p.isValid("()"));
        System.out.println("max window k=2 → " + p.maxSumWindow(new int[] { 1, 4, 2, 7 }, 2));
        System.out.println("reverse list → " + p.listToString(p.reverseList(p.build(1, 2, 3))));
    }

    // TODO: stack — valid parentheses
    boolean isValid(String s) {
        return false;
    }

    // TODO: fixed sliding window max sum
    int maxSumWindow(int[] nums, int k) {
        return 0;
    }

    // --- helpers for linked list practice ---
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    ListNode build(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        for (int v : values) {
            t.next = new ListNode(v);
            t = t.next;
        }
        return dummy.next;
    }

    String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("->");
            head = head.next;
        }
        return sb.toString();
    }

    // TODO: reverse linked list (iterative) — see 17_LinkedListNode.java
    ListNode reverseList(ListNode head) {
        return null;
    }
}
