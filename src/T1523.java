/**
 * 1523. Count Odd Numbers in an Interval Range
 * Easy
 * 1.4K
 * 94
 * Companies
 * Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: low = 3, high = 7
 * Output: 3
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 * Example 2:
 * <p>
 * Input: low = 8, high = 10
 * Output: 1
 * Explanation: The odd numbers between 8 and 10 are [9].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= low <= high <= 10^9
 */


public class T1523 {

    static public int countOdds(int low, int high) {
        int result;


        if ((high + low) % 2 == 1) {
            result = (high - low) / 2 ;
        } else {
            result = ((high - low) / 2)-1;
        }


        if (low % 2 == 1) {
            result++;
        }
        if (high % 2 == 1) {
            result++;
        }
//        if ((high + low) % 2 == 0) {
//            result++;
//        }
        return result;
    }

    public static void main(String[] args) {
    //    System.out.println(countOdds(3, 7));
        System.out.println(countOdds(0, 2));
    }
}

  