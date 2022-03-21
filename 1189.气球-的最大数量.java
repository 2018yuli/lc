/*
 * @lc app=leetcode.cn id=1189 lang=java
 *
 * [1189] “气球” 的最大数量
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        // mine
        // if (text == null || "".equals(text)) return 0;
        // int[] words = new int[26];
        // int result = Integer.MAX_VALUE;
        // for (char c : text.toCharArray()) {
        //     words[c - 'a'] += 1;
        // }
        // result = Math.min(result, words['b' - 'a']);
        // result = Math.min(result, words['a' - 'a']);
        // result = Math.min(result, words['l' - 'a']/2);
        // result = Math.min(result, words['o' - 'a']/2);
        // result = Math.min(result, words['n' - 'a']);
        // return result;

        // Solution from Nick White
        int[] charCount = new int[26];
        for (int i = 0 ; i < text.length() ; i++) {
            charCount[text.charAt(i) - 'a']++;
        }

        // b
        int min = charCount[1];
        // a
        min = Math.min(min, charCount[0]);
        // l
        min = Math.min(min, charCount[11] / 2);
        // o
        min = Math.min(min, charCount[14] / 2);
        // n
        min = Math.min(min, charCount[13]);
        return min;
    }
}
// @lc code=end

