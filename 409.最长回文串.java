/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        // mine
        // Map<Character, Integer> words = new HashMap<Character, Integer>();
        // for (char c : s.toCharArray()) {
        //     int count = words.getOrDefault(c, 0);
        //     words.put(c, ++count);
        // }
        // boolean middleWord = false;
        // int result = 0;
        // for (Integer count : words.values()) {
        //     if (!middleWord && count % 2 == 1) {
        //         middleWord = true;
        //     }
        //     result += count / 2 * 2;
        // }
        // if (middleWord)
        //     return result + 1;
        // else
        //     return result;

        // Solution from Nick White
        int[] charCounts = new int[128];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int result = 0;
        for (Integer charCount : charCounts) {
            result += charCount / 2 * 2;
            if (result % 2 == 0 && charCount % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
}
// @lc code=end

