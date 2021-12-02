/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        // Solution from Nick White
        char[] stack = new char[s.length()];
        int i = 0;

        for (int j = 0 ; j < s.length() ; j++) {
            char currentChar = s.charAt(j);
            if (i > 0 && stack[i - 1] == currentChar) {
                i--;
            }else {
                stack[i] = currentChar;
                i++;
            }
        }
        return new String(stack, 0, i);
    }
}
// @lc code=end

