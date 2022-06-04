/*
 * @lc app=leetcode.cn id=127 lang=java
 *
 * [127] 单词接龙
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // mine, TODO
        if (!wordList.contains(endWord)) return 0;
        wordList.remove(endWord);
        wordList.remove(beginWord);
        int result = treeBuild(1, wordList, endWord, beginWord);
        return result;
        
    }

    private int treeBuild(int count, List<String> wordList, String endWord, String beginWord) {
        if (diff(endWord, beginWord) == 1) {
            return count + 1;
        }
        int minResult = 0;
        for (String word : wordList) {
            if (diff(word, endWord) == 1) {
                List<String> wordList1 = new ArrayList<String>(wordList);
                wordList1.remove(word);
                int result = treeBuild(count + 1, wordList1, word, beginWord);
                if (result != 0) {
                    if (minResult == 0) minResult = result;
                    minResult = Math.min(minResult, minResult);
                }
            }
        }

        return minResult;
    }

    private int diff(String word1, String word2) {
        int len = word1.length();
        if (len != word2.length()) return -1;

        int count = 0;
        for (int i = 0 ; i < len ; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count ++;
            }
        }
        return count;
    }
}
// @lc code=end
