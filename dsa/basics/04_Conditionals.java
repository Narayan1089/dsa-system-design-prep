/**
 * 04 — Branching: if / else and switch
 *
 * SYNTAX:
 *   if (condition) { }
 *   else if (condition) { }
 *   else { }
 *
 *   switch (value) {
 *     case X: ...; break;
 *     default: ...;
 *   }
 */
class Conditionals {

    public static void main(String[] args) {

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");   // ← runs this
        } else {
            System.out.println("Grade: C or below");
        }

        // switch — good for many fixed options (day of week, menu choice)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;   // exit switch — without break, falls through to next case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // Ternary: condition ? valueIfTrue : valueIfFalse
        String status = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Status: " + status);
    }
}
