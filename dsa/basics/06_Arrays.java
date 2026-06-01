/**
 * 06 — Arrays (most important for DSA)
 *
 * SYNTAX:
 *   int[] arr = new int[size];     → all zeros
 *   int[] arr = { 1, 2, 3 };       → literal initializer
 *   arr[i]                          → index from 0 to length-1
 *   arr.length                      → number of elements (not a method!)
 */
class ArraysBasics {

    public static void main(String[] args) {

        // Create fixed-size array
        int[] scores = new int[3];   // [0, 0, 0]
        scores[0] = 90;
        scores[1] = 85;
        scores[2] = 88;

        // Or initialize in one line
        int[] primes = { 2, 3, 5, 7 };

        System.out.println("scores[1] = " + scores[1]);
        System.out.println("primes.length = " + primes.length);

        // Loop with index — needed when you need position (Two Sum, etc.)
        System.out.print("primes with index: ");
        for (int i = 0; i < primes.length; i++) {
            System.out.print("[" + i + "]=" + primes[i] + " ");
        }
        System.out.println();

        // Find max — pattern you'll reuse
        int max = primes[0];
        for (int i = 1; i < primes.length; i++) {
            if (primes[i] > max) {
                max = primes[i];
            }
        }
        System.out.println("max = " + max);

        // 2D array — matrix / grid problems
        int[][] grid = {
            { 1, 2 },
            { 3, 4 }
        };
        System.out.println("grid[1][0] = " + grid[0][0]);  // 3
    }
}
