/*
 * @lc app=leetcode.cn id=127 lang=java
 *
 * [127] 单词接龙
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // mine, TODO
        // if (!wordList.contains(endWord)) return 0;
        // wordList.remove(endWord);
        // wordList.remove(beginWord);
        // int result = treeBuild(1, wordList, endWord, beginWord);
        // return result;

        // Solution from Nick White B first search
        HashSet<String> set = new HashSet<String>();
        for (String word : wordList) {
            set.add(word);
        }

        if (!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<String>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0 ; i < size ; i++) {
                String currentWord = queue.poll();
                char[] wordChars = currentWord.toCharArray();
                for (int j = 0 ; j < wordChars.length ; j++) {
                    char originalChar = wordChars[j];
                    for (char c = 'a' ; c <= 'z' ; c++) {
                        if (wordChars[j] == c) continue;

                        wordChars[j] = c;
                        String newWord = String.valueOf(wordChars);

                        if (newWord.equals(endWord)) return level + 1;

                        if (set.contains(newWord)) {
                            queue.offer(newWord);
                            set.remove(newWord);
                        }  
                    }
                    wordChars[j] = originalChar;
                }
            }

            level++;
        }
        return 0;
    }

    // private int treeBuild(int count, List<String> wordList, String endWord, String beginWord) {
    //     if (diff(endWord, beginWord) == 1) {
    //         return count + 1;
    //     }
    //     int minResult = 0;
    //     for (String word : wordList) {
    //         if (diff(word, endWord) == 1) {
    //             List<String> wordList1 = new ArrayList<String>(wordList);
    //             wordList1.remove(word);
    //             int result = treeBuild(count + 1, wordList1, word, beginWord);
    //             if (result != 0) {
    //                 if (minResult == 0) minResult = result;
    //                 minResult = Math.min(minResult, minResult);
    //             }
    //         }
    //     }

    //     return minResult;
    // }

    // private int diff(String word1, String word2) {
    //     int len = word1.length();
    //     if (len != word2.length()) return -1;

    //     int count = 0;
    //     for (int i = 0 ; i < len ; i++) {
    //         if (word1.charAt(i) != word2.charAt(i)) {
    //             count ++;
    //         }
    //     }
    //     return count;
    // }
}
// @lc code=end
