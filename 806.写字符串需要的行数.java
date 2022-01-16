/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        // mine
        // int lines = 0;
        // int lastLineWidth = 0;
        // for (char c : s.toCharArray()) {
        //     int width = widths[c - 'a'];
        //     if (width + lastLineWidth == 100) {
        //         lines++;
        //         lastLineWidth = 0;
        //     }
        //     else if (width + lastLineWidth > 100) {
        //         lines++;
        //         lastLineWidth = width;
        //     }
        //     else {
        //         lastLineWidth += width;
        //     }

        // }
        // int[] result = new int[2];
        // result[0] = lines + (lastLineWidth == 0 ? 0 : 1);
        // result[1] = lastLineWidth == 0 ? 100 : lastLineWidth;
        // return result;

        // Solution from Nick White
        int[] result = new int[2];
        int numLines = 1;
        int width = 0;

        for (char c : s.toCharArray()) {
            int charWidth = widths[c - 'a'];
            if (charWidth + width > 100) {
                numLines++;
                width = 0;
            }
            width += charWidth;
        }
        result[0] = numLines;
        result[1] = width;
        return result;
    }
}
// @lc code=end

