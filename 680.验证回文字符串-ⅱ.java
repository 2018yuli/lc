/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        // Solution from Nick White
        int aPoint = 0;
        int bPoint = s.length() - 1;

        while (aPoint <= bPoint) {
            if (s.charAt(aPoint) != s.charAt(bPoint)) {
                // call helper method
                return helperMethod(s, aPoint + 1, bPoint) || helperMethod(s, aPoint, bPoint - 1);
            }
            aPoint++;
            bPoint--;
        }
        return true;
    }

    /**
     * @param s     被判断的字符串
     * @param i     头指针
     * @param j     尾指针
     */
    public boolean helperMethod(String s, int i, int j) {
        int aPoint = i;
        int bPoint = j;

        while (aPoint <= bPoint) {
            if (s.charAt(aPoint) != s.charAt(bPoint)) {
                return false;
            }
            aPoint++;
            bPoint--;
        }
        return true;
    }
}
// @lc code=end

