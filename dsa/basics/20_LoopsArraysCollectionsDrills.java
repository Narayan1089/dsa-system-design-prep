import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 20 — One file: arrays + loops + HashMap + HashSet (easy → little medium)
 *
 * HOW TO USE:
 *   1. Run as-is: ./run 20_LoopsArraysCollectionsDrills.java
 *      → prints each question + reference answer (study mode)
 *   2. Fill in practice_* methods below, set PRACTICE_MODE = true, run again
 *      → checks your code vs expected
 *
 * Do this BEFORE stack/queue (lesson 12).
 */
class LoopsArraysCollectionsDrills {

    static final boolean PRACTICE_MODE = false; // flip to true when you code practice_* methods

    public static void main(String[] args) {
        if (PRACTICE_MODE) {
            runPracticeTests();
        } else {
            runDemoMode();
        }
    }

    // ===================== DEMO MODE (read output, then try practice_*) =====================

    static void runDemoMode() {
        System.out.println("========== ARRAYS + LOOPS ==========\n");

        demo(1, "Sum all elements",
                new int[] { 1, 2, 3, 4 },
                solution_sum(new int[] { 1, 2, 3, 8 }));

        demo(2, "Find maximum",
                new int[] { 3, 9, 1, 9, 2 },
                solution_max(new int[] { 3, 9, 1, 9, 2 }));

        demo(3, "Count how many numbers are even",
                new int[] { 1, 2, 3, 4, 5, 6 },
                solution_countEven(new int[] { 1, 2, 3, 4, 5, 6 }));

        demo(4, "Index of target (linear search), or -1",
                "target=9 in [3,9,1]",
                solution_indexOf(new int[] { 3, 9, 1 }, 9));

        demo(5, "Reverse into NEW array",
                new int[] { 1, 2, 3 },
                Arrays.toString(solution_reverseCopy(new int[] { 1, 2, 3 })));

        demo(6, "Reverse IN PLACE (same array)",
                beforeInPlace(new int[] { 1, 2, 3, 4 }),
                afterInPlaceReverse(new int[] { 1, 2, 3, 4 }));

        demo(7, "Second largest value (distinct logic ok for practice)",
                new int[] { 10, 5, 10, 3 },
                solution_secondLargest(new int[] { 10, 5, 10, 3 }));

        demo(8, "Move all zeros to end (in place) — [0,1,0,3,12] → [1,3,12,0,0]",
                beforeInPlace(new int[] { 0, 1, 0, 3, 12 }),
                afterMoveZeroes(new int[] { 0, 1, 0, 3, 12 }));

        demo(9, "Two indices with sum = target (BRUTE force, nested loop)",
                "nums=[2,11,8,15] target=26",
                Arrays.toString(solution_twoSumBrute(new int[] { 2, 11, 8, 15 }, 26)));

        System.out.println("\n========== HASHMAP ==========\n");

        demo(10, "Frequency map: value → how many times",
                new int[] { 1, 2, 2, 3, 1 },
                solution_frequency(new int[] { 1, 2, 2, 3, 1 }).toString());

        demo(11, "Most frequent element",
                new int[] { 1, 2, 2, 2, 3 },
                solution_mostFrequent(new int[] { 1, 2, 2, 2, 3 }));

        demo(12, "Two Sum with HashMap (one pass)",
                "target=9, [2,7,11,15]",
                Arrays.toString(solution_twoSumMap(new int[] { 2, 7, 11, 15 }, 9)));

        demo(13, "First index where nums[i] == nums[i-1] (adjacent duplicate)",
                new int[] { 1, 2, 2, 3 },
                solution_firstAdjacentDupIndex(new int[] { 1, 2, 2, 3 }));

        System.out.println("\n========== HASHSET ==========\n");

        demo(14, "Count UNIQUE values",
                new int[] { 1, 2, 2, 3, 3, 3 },
                solution_uniqueCount(new int[] { 1, 2, 2, 3, 3, 3 }));

        demo(15, "Contains duplicate? (any value twice)",
                new int[] { 1, 2, 3, 2 },
                solution_hasDuplicate(new int[] { 1, 2, 3, 2 }));

        demo(16, "Do arrays share any value? (set intersection non-empty)",
                "a=[1,2,3] b=[3,9]",
                solution_hasCommon(new int[] { 1, 2, 3 }, new int[] { 3, 9 }));

        System.out.println("\n--- Tip: set PRACTICE_MODE = true and fill practice_* methods ---\n");
    }

    static void demo(int n, String question, Object input, Object answer) {
        System.out.println("Q" + n + ": " + question);
        System.out.println("    input:  " + input);
        System.out.println("    answer: " + answer);
        System.out.println();
    }

    static String beforeInPlace(int[] a) {
        return Arrays.toString(a);
    }

    static String afterInPlaceReverse(int[] a) {
        solution_reverseInPlace(a);
        return Arrays.toString(a);
    }

    static String afterMoveZeroes(int[] a) {
        solution_moveZeroes(a);
        return Arrays.toString(a);
    }

    // ===================== PRACTICE MODE (YOU write these) =====================

    static void runPracticeTests() {
        System.out.println("PRACTICE MODE — checking your practice_* methods\n");
        check("sum", practice_sum(arr(1, 2, 3, 4)), 10);
        check("max", practice_max(arr(3, 9, 1)), 9);
        check("countEven", practice_countEven(arr(1, 2, 3, 4)), 2);
        check("indexOf", practice_indexOf(arr(3, 9, 1), 9), 1);
        check("reverseCopy", Arrays.toString(practice_reverseCopy(arr(1, 2, 3))), "[3, 2, 1]");
        int[] inPlace = arr(1, 2, 3);
        practice_reverseInPlace(inPlace);
        check("reverseInPlace", Arrays.toString(inPlace), "[3, 2, 1]");
        check("secondLargest", practice_secondLargest(arr(10, 5, 10, 3)), 10);
        int[] zeros = arr(0, 1, 0, 3, 12);
        practice_moveZeroes(zeros);
        check("moveZeroes", Arrays.toString(zeros), "[1, 3, 12, 0, 0]");
        check("twoSumBrute", Arrays.toString(practice_twoSumBrute(arr(2, 11, 8, 15), 26)), "[1, 3]");
        check("mostFrequent", practice_mostFrequent(arr(1, 2, 2, 2, 3)), 2);
        check("twoSumMap", Arrays.toString(practice_twoSumMap(arr(2, 7, 11, 15), 9)), "[0, 1]");
        check("firstAdjacentDup", practice_firstAdjacentDupIndex(arr(1, 2, 2, 3)), 2);
        check("uniqueCount", practice_uniqueCount(arr(1, 2, 2, 3)), 3);
        check("hasDuplicate", practice_hasDuplicate(arr(1, 2, 3, 2)), true);
        check("hasCommon", practice_hasCommon(arr(1, 2, 3), arr(3, 9)), true);
        System.out.println("\nDone. Fix any FAIL lines, run again.");
    }

    static void check(String name, Object actual, Object expected) {
        boolean ok = String.valueOf(actual).equals(String.valueOf(expected));
        System.out.println((ok ? "PASS" : "FAIL") + " " + name + " → got " + actual + ", expected " + expected);
    }

    static int[] arr(int... v) {
        return v;
    }

    // ---------- practice_* : YOUR CODE (stubs return wrong defaults on purpose) ----------

    static int practice_sum(int[] a) {
        int sum = 0;
        for (int x: a) {
            sum += x;
        }
        return sum;
    }

    static int practice_max(int[] a) {
        int max = a[0];
        for (int i=0;i< a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int practice_countEven(int[] a) { 
        int count = 0;
        for (int x: a) {
            if(x % 2  ==0) {
                count = count +1;
            }
        }   
        return count;
    }

    static int practice_indexOf(int[] a, int target) {
        int index = 0;
        for (int i=0;i< a.length; i++) {
            if(a[i] == target){
                index = i;
            }
        }

        return index    ;
    }

    static int[] practice_reverseCopy(int[] a) {
        return new int[0];
    }

    static void practice_reverseInPlace(int[] a) {
    }

    static int practice_secondLargest(int[] a) {
        return 0;
    }

    static void practice_moveZeroes(int[] a) {
    }

    static int[] practice_twoSumBrute(int[] a, int target) {
        return new int[0];
    }

    static int practice_mostFrequent(int[] a) {
        return 0;
    }

    static int[] practice_twoSumMap(int[] a, int target) {
        return new int[0];
    }

    static int practice_firstAdjacentDupIndex(int[] a) {
        return -1;
    }

    static int practice_uniqueCount(int[] a) {
        return 0;
    }

    static boolean practice_hasDuplicate(int[] a) {
        return false;
    }

    static boolean practice_hasCommon(int[] a, int[] b) {
        return false;
    }

    // ===================== SOLUTIONS (reference — study or copy into practice_*) =====================

    static int solution_sum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    static int solution_max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int solution_countEven(int[] a) {
        int count = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int solution_indexOf(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int[] solution_reverseCopy(int[] a) {
        int[] out = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = a[a.length - 1 - i];
        }
        return out;
    }

    static void solution_reverseInPlace(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
    }

    static int solution_secondLargest(int[] a) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        return second;
    }

    static void solution_moveZeroes(int[] a) {
        int write = 0;
        for (int read = 0; read < a.length; read++) {
            if (a[read] != 0) {
                int tmp = a[write];
                a[write] = a[read];
                a[read] = tmp;
                write++;
            }
        }
    }

    static int[] solution_twoSumBrute(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    static Map<Integer, Integer> solution_frequency(int[] a) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : a) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return freq;
    }

    static int solution_mostFrequent(int[] a) {
        Map<Integer, Integer> freq = solution_frequency(a);
        int bestVal = a[0];
        int bestCount = 0;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > bestCount) {
                bestCount = e.getValue();
                bestVal = e.getKey();
            }
        }
        return bestVal;
    }

    static int[] solution_twoSumMap(int[] a, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int need = target - a[i];
            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }
            seen.put(a[i], i);
        }
        return new int[0];
    }

    static int solution_firstAdjacentDupIndex(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    static int solution_uniqueCount(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }
        return set.size();
    }

    static boolean solution_hasDuplicate(int[] a) {
        Set<Integer> seen = new HashSet<>();
        for (int x : a) {
            if (seen.contains(x)) {
                return true;
            }
            seen.add(x);
        }
        return false;
    }

    static boolean solution_hasCommon(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            if (set.contains(x)) {
                return true;
            }
        }
        return false;
    }
}
