import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 12 — Stack (LIFO) with ArrayDeque
 *
 * SYNTAX:
 *   Deque<Integer> stack = new ArrayDeque<>();
 *   stack.push(x);     // add top
 *   stack.pop();       // remove top
 *   stack.peek();      // see top
 *   stack.isEmpty();
 *
 * Pattern: matching brackets — push opens, pop on close if matches
 */
class StackBasics {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println("peek = " + stack.peek());  // 20
        System.out.println("pop  = " + stack.pop());   // 20
        System.out.println("pop  = " + stack.pop());   // 10

        System.out.println("()[]{} valid? " + isValidBrackets("()[]{}"));
        System.out.println("(] valid? " + isValidBrackets("(]"));
    }

    static boolean isValidBrackets(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!matches(open, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}
