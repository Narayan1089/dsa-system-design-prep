/**
 * 02 — Variables and primitive types
 *
 * SYNTAX:
 *   type name = value;
 *   final type name = value;   → cannot reassign (constant)
 */
class VariablesAndTypes {

    public static void main(String[] args) {

        // --- Primitives (store value directly) ---
        int age = 25;              // whole numbers
        double price = 19.99;      // decimals
        boolean isActive = true;   // true or false
        char grade = 'A';          // single character, single quotes

        // --- Reference type (stores address to object on heap) ---
        String name = "Narayan";   // double quotes for text

        System.out.println("Name: " + name + ", age: " + age);

        // Reassigning is OK for non-final variables
        age = 26;
        System.out.println("Next year age: " + age);

        // final = constant — uncommenting next line would NOT compile:
        // final int MAX = 100;
        // MAX = 200;  // error: cannot assign to final variable

        // Widening: int → double is automatic
        int count = 5;
        int average = count / (int) 2.0;  // use 2.0 or cast: (double) count / 2
        System.out.println("Average: " + average);
    }
}
