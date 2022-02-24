/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        // mine
        // boolean carry = false;
        // for (int i = digits.length - 1 ; i >= 0 ; i--) {
        //     if (digits[i] == 9) {
        //         carry = true;
        //         digits[i] = 0;
        //     } else {
        //         carry = false;
        //         digits[i] = digits[i] + 1;
        //         break;
        //     }
        // }
        // if (carry) {
        //     int[] result = new int[digits.length + 1];
        //     result[0] = 1;
        //     System.arraycopy(digits, 0, result, 1, digits.length);
        //     return result;
        // }
        // return digits;

        // Solution from Nick White
        int n = digits.length;
        for (int i = n - 1 ; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
// @lc code=end

