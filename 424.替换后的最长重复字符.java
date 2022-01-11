/*
 * @lc app=leetcode.cn id=424 lang=java
 *
 * [424] 替换后的最长重复字符
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        // mine
        // int result = 0;
        // Set<Character> chars = new HashSet<Character>();
        // for (char c : s.toCharArray()) {
        //     if (!chars.contains(c)) {
        //         result = Math.max(result, longestOnes(s, c, k));
        //     }
        //     chars.add(c);
        // }
        // return result;

        // Solution from Nick White
        int n = s.length();
        int[] charCounts = new int[26];

        int windowStart = 0;
        int maxLength = 0;
        int maxCount = 0;

        for (int windowEnd = 0 ; windowEnd < n ; windowEnd++) {
            charCounts[s.charAt(windowEnd) - 'A']++;
            int currentCharCount = charCounts[s.charAt(windowEnd) - 'A'];
            maxCount = Math.max(maxCount, currentCharCount);

            while (windowEnd - windowStart + 1 > maxCount + k) {
                charCounts[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    // private int longestOnes(String s, char c, int k) {
    //     int i = 0;
    //     int j = 0;
    //     int length = s.length();
    //     while (i < length) {
    //         if (s.charAt(i) != c) k--;
    //         if (k < 0) {
    //             if (s.charAt(j) != c) {
    //                 k++;
    //             }
    //             j++;
    //         }
    //         i++;
    //     }
    //     return i - j;
    // }
}
// @lc code=end

