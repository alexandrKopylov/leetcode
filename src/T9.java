/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */

public class T9 {

   static public boolean isPalindrome(int x) {
//        String str = String.valueOf(x);
//        for (int i = 0; i <str.length()/2 ; i++) {
//
//            char k= str.charAt(i);
//            char m=str.charAt(str.length()-1-i);
//            if(k != m){
//                return false;
//            }
//
//        }
//        return true;


       if(x<0)return false;
       int temp=x;
       int sum=0;
       while(x!=0){
           sum=(sum*10)+(x%10);
           x=x/10;
       }
       return (temp==sum);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12345));
    }
}
