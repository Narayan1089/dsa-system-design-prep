/**
 * 03 — Operators
 *
 * ARITHMETIC:  +  -  *  /  %
 * COMPARISON:  ==  !=  <  >  <=  >=   (result is boolean)
 * LOGICAL:     &&  ||  !              (short-circuit: stop when result known)
 */
class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a / b = " + (a / b));   // 3  (integer division truncates)
        System.out.println("a % b = " + (a % b));   // 1  (remainder — useful in DSA)

        // Comparison → boolean
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a > b:  " + (a > b));    // true

        // Logical — both sides must be boolean
        boolean sunny = true;
        boolean warm = false;
        if (sunny && warm) {
            System.out.println("Beach day");
        } else {
            System.out.println("Maybe another day");  // this runs
        }

        // Unary
        int x = 5;
        x++;           // same as x = x + 1  → 6
        System.out.println("x after ++: " + x);
        x--;           // same as x = x - 1  → 5
        System.out.println("x after --: " + x);
        x += 10;           // same as x = x + 10  → 15
        System.out.println("x after += 10: " + x);
        x -= 10;           // same as x = x - 10  → 5
        System.out.println("x after -= 10: " + x);
        x *= 10;           // same as x = x * 10  → 50
        System.out.println("x after *= 10: " + x);
        x /= 10;           // same as x = x / 10  → 5
        System.out.println("x after /= 10: " + x);
    }
}
