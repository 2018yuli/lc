/*
 * @lc app=leetcode.cn id=1160 lang=java
 *
 * [1160] 拼写单词
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        // minie
        // int count = 0;
        // int[] alphabet = new int[26];
        // for (int i = 0 ; i < chars.length() ; i++) {
        //     alphabet[chars.charAt(i) - 'a'] += 1;
        // }
        // for (String word : words) {
        //      int[] need = new int[26];
        //      for (int i = 0 ; i < word.length() ; i++) {
        //          need[word.charAt(i) - 'a'] += 1;
        //      }
        //      boolean afford = true;
        //      for (int i = 0 ; i < 26 ; i++) {
        //          if (need[i] > alphabet[i]) {
        //              afford = false;
        //              break;
        //          }
        //      }
        //      if (afford)
        //         count += word.length();
        // }
        // return count;
        
        // Solution from Nick White
        int goodWordLength = 0;
        int[] charCount = new int[26];

        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (String word : words) {
            int [] tempCharCount = Arrays.copyOf(charCount, charCount.length);
            int validCharCount = 0;

            for (char c : word.toCharArray()) {
                if (tempCharCount[c - 'a'] > 0) {
                    validCharCount++;
                    tempCharCount[c - 'a']--;
                }
            }

            if (validCharCount == word.length()) {
                goodWordLength += validCharCount;
            }
        }

        return goodWordLength;
    }
}
// @lc code=end

