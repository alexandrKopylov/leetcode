import java.util.LinkedList;
import java.util.List;

/**
 * 412. Fizz Buzz
 * Easy
 * 1.6K
 * 232
 * Companies
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * <p>
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class T412 {
    static public List<String> fizzBuzz(int n) {
        List<String> res = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {

            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

}
