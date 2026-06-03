/**
 * 16 — Recursion (function calls itself)
 *
 * You need:
 *   1. Base case — stop
 *   2. Recursive case — smaller subproblem
 *
 * Watch: stack depth, overlapping subproblems → DP later
 */
class RecursionBasics {

    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("sum [1..5] = " + sumArray(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println("fib(6) = " + fib(6));
        printDown(3);
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1; // base case
        }
        return n * factorial(n - 1);
    }

    static int sumArray(int[] arr) {
        return sumFromIndex(arr, 0);
    }

    static int sumFromIndex(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sumFromIndex(arr, i + 1);
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2); // slow for large n — DP improves this
    }

    static void printDown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("n = " + n);
        printDown(n - 1);
    }
}
