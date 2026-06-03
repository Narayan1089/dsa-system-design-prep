import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 13 — Queue (FIFO) with ArrayDeque
 *
 * SYNTAX:
 *   Queue<Integer> q = new ArrayDeque<>();
 *   q.offer(x);   // add to back
 *   q.poll();     // remove from front
 *   q.peek();     // front without remove
 *
 * Used for: BFS (graphs/trees), level-order traversal, scheduling
 */
class QueueBasics {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("peek front = " + q.peek());  // 10
        System.out.println("poll = " + q.poll());        // 10
        System.out.println("poll = " + q.poll());        // 20

        // BFS-style: process layer by layer (simple numbers)
        int[][] levels = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        bfsPrintLevels(levels);
    }

    /** Simulates visiting nodes level by level */
    static void bfsPrintLevels(int[][] levels) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int[] level : levels) {
            for (int node : level) {
                q.offer(node);
            }
            System.out.print("processing level: ");
            int size = q.size();
            for (int i = 0; i < size; i++) {
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}
