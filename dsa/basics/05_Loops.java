/**
 * 05 — Loops (you will use these in almost every DSA problem)
 *
 *   for (init; condition; update) { }
 *   while (condition) { }
 *   do { } while (condition);   → runs at least once
 *   for (type item : collection) { }  → enhanced for (read-only style)
 */
class Loops {

    public static void main(String[] args) {

        // Classic for — best when you know start, end, and step
        System.out.print("for 0..4: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while — condition checked before each iteration
        int n = 3;
        System.out.print("while countdown: ");
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        // do-while — body runs once even if condition is false
        int x = 3;
        do {
            System.out.println("do-while runs once, x=" + x);
            x++;
        } while (x < 0);  // false immediately after first run

        // Enhanced for — iterate every element (arrays, ArrayList, etc.)
        int[] nums = { 10, 20, 30 };
        System.out.print("enhanced for: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Nested loop — common for 2D grids, pairs (watch O(n²) time)
        System.out.println("nested 2x2:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println("  row=" + row + " col=" + col);
            }
        }
    }
}
