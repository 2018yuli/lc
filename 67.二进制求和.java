/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        // mine
        // int numA = str2Num(a);
        // int numB = str2Num(b);
        // String result = num2Str(numA + numB);
        // return "".equals(result) ? "0" : result;

        // mine2
        // a = new StringBuilder(a).reverse().toString();
        // b = new StringBuilder(b).reverse().toString();
        // int aLen = a.length();
        // int bLen = b.length();
        // int len = Math.max(aLen, bLen);
        // StringBuilder result = new StringBuilder();
        // int carry = 0;
        // for (int i = 0 ; i < len ; i++) {
        //     int numA = 0;
        //     int numB = 0;
        //     if (i < aLen && a.charAt(i) == '1')
        //         numA = 1;
        //     if (i < bLen && b.charAt(i) == '1')
        //         numB = 1;
        //     int sum = carry + numA + numB;
        //     if (sum > 1)
        //         carry = 1;
        //     else 
        //         carry = 0;
        //     if (sum == 1 || sum == 3)
        //         result.append("1");
        //     else
        //         result.append("0");
        // }
        // if (carry == 1)
        //     result.append("1");
        // return result.reverse().toString();

        // Solution from Nick White
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    // private int str2Num(String a) {
    //     int result = 0;
    //     int len = a.length();
    //     for (int i = 0 ; i < len ; i++) {
    //         result = result * 2 + (a.charAt(i) == '1' ? 1 : 0);
    //     }
    //     return result;
    // }
    // private String num2Str(int num) {
    //     StringBuilder sb = new StringBuilder();
    //     while (num > 0) {
    //         if (num % 2 == 1)
    //             sb.append("1");
    //         else
    //             sb.append("0");
    //         num = num / 2;
    //     }
    //     return sb.reverse().toString();
    // }
}
// @lc code=end

