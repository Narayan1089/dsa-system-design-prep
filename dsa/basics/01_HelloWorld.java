/**
 * 01 — Your first Java program
 *
 * SYNTAX CHEAT SHEET:
 *   class ClassName { }            → numbered file names are OK in this folder
 *   public static void main(...)   → entry point JVM runs first
 *   System.out.println("text");    → print line to console
 */
class HelloWorld {

    // "static" = belongs to the class, not an object instance
    // "void"   = this method returns nothing
    // "String[] args" = command-line arguments (optional for now)
    public static void main(String[] args) {
        System.out.println("Hello,  prep!");

        // println with numbers — no quotes around numbers
        System.out.println(10 + 20);  // prints 30
    }
}
