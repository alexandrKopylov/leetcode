import java.util.Arrays;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Returnwealth that the richest customer has.
 * <p>
 * wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 * Example 2:
 * <p>
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 * Example 3:
 * <p>
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 */

public class T1672 {

    static public int maxWelth(int[][] accounts) {
//        int maxSum = 0;
//        for (int[] ac : accounts) {
//            int tmpSum = 0;
//            for (int bank : ac) {
//                tmpSum += bank;
//            }
//            maxSum = Math.max(maxSum, tmpSum);
//        }
//        return maxSum;


            return Arrays.stream(accounts)
                    .mapToInt(account -> Arrays.stream(account).sum())
                    .max()
                    .getAsInt();
        }



    public static void main(String[] args) {
        int[][] accc = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maxWelth(accc));

    }

}
