/**
 * 07 — Methods (functions inside a class)
 *
 * SYNTAX:
 *   access returnType name(parameters) {
 *       return value;
 *   }
 *
 * Example from DSA: int[] twoSum(int[] nums, int target)
 */
class MethodsBasics {

    public static void main(String[] args) {
        greet("Narayan");

        int sum = add(4, 6);
        System.out.println("4 + 6 = " + sum);

        int[] data = { 1, 2, 3, 4 };
        System.out.println("sum of array = " + sumArray(data));

        // Same method name, different parameters = overloading
        System.out.println(max(3, 7));
        System.out.println(max(3, 7, 2));
    }

    // void = returns nothing
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // returns int
    static int add(int a, int b) {
        return a + b;
    }
  
    // array parameter — passed by reference (same array object)
    static int sumArray(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    // Overloading: same name, different parameter list
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
