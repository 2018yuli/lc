/*
 * @lc app=leetcode.cn id=819 lang=java
 *
 * [819] 最常见的单词
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // mine
        // String result = "";
        // Map<String, Integer> wordsCount = new HashMap<String, Integer>();
        // for (String bannedWord : banned) {
        //     wordsCount.put(bannedWord, -1000);          
        // }
        // String[] words = paragraph.split("[ !?',;\\.]");
        // for (String word : words) {
        //     if (word != null && !"".equals(word)) {
        //     	String lowerCaseWord = word.toLowerCase();
        //         wordsCount.put(lowerCaseWord, wordsCount.get(lowerCaseWord) == null ? 1 : wordsCount.get(lowerCaseWord) + 1);
        //     }
        // }
        // int maxCount = 0;
        // for (String word : wordsCount.keySet()) {
        //     int count = wordsCount.get(word);
        //     if (count > maxCount) {
        //         maxCount = count;
        //         result = word;
        //     }
        // }
        // return result;

        // Solution from NiCK White
        HashSet<String> bannedWords = new HashSet<String>();
        HashMap<String, Integer> validWordCounts = new HashMap<String, Integer>();

        for (String bannedWord : banned) {
            bannedWords.add(bannedWord);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                validWordCounts.put(word, validWordCounts.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String result = "";

        for (String word : validWordCounts.keySet()) {
            if (validWordCounts.get(word) > max) {
                max = validWordCounts.get(word);
                result = word;
            }
        }

        return result;

    }
}
// @lc code=end

