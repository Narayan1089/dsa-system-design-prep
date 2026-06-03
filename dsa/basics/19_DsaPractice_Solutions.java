import java.util.ArrayDeque;
import java.util.Deque;

/** Solutions for 19_DsaPractice.java — peek after trying */
class DsaPracticeSolutions {

    public static void main(String[] args) {
        DsaPracticeSolutions s = new DsaPracticeSolutions();
        System.out.println("valid ()? " + s.isValid("()"));
        System.out.println("max window = " + s.maxSumWindow(new int[] { 1, 4, 2, 7 }, 2));
    }

    boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char o = st.pop();
                if ((o == '(' && c != ')') || (o == '[' && c != ']') || (o == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    int maxSumWindow(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int best = sum;
        for (int r = k; r < nums.length; r++) {
            sum += nums[r] - nums[r - k];
            best = Math.max(best, sum);
        }
        return best;
    }
}
