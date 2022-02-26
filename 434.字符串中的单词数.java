/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        // mine
        // int result = 0;
        // if (s == null || "".equals(s)) return 0;
        // String[] arr = s.split(" ");
        // for (String str : arr) {
        //     if (!"".equals(str.trim())) {
        //         result++;
        //     }
        // }
        // return result;

        // Solution from Nick White
        int segments = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ')&& s.charAt(i) != ' ') {
                segments++;
            }
        }
        return segments;
    }
}
// @lc code=end

