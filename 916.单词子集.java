/*
 * @lc app=leetcode.cn id=916 lang=java
 *
 * [916] 单词子集
 */

// @lc code=start
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // Solution from Nick White
        List<String> result = new ArrayList<String>();
        // Do not loop though words2, just loop though words1
        int[] maxFrequency = new int[26];
        for (int i = 0 ; i < words2.length ; i++) {
            String currentWord = words2[i];
            int[] charFrequency = getCharFrequency(currentWord);
            for (int j = 0 ; j < 26 ; j++) {
                maxFrequency[j] = Math.max(maxFrequency[j], charFrequency[j]);
            }
        }
        //
        for (int i = 0 ; i < words1.length ; i++) {
            String currentWord = words1[i];
            int[] charCounts = getCharFrequency(currentWord);
            
            boolean valid = true;
            for (int j = 0 ; j < 26 ; j++) {
                if (charCounts[j] < maxFrequency[j]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(currentWord);
            }
        }
        return result;
    }

    public int[] getCharFrequency(String s) {
        int[] result = new int[26];
        for (char c : s.toCharArray()) {
            result[c - 'a']++;
        }
        return result;
    }
}
// @lc code=end

