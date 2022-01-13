/*
 * @lc app=leetcode.cn id=953 lang=java
 *
 * [953] 验证外星语词典
 */

// @lc code=start
class Solution {
    public int[] charMap;
    public boolean isAlienSorted(String[] words, String order) {
        // mine
        // if (words.length == 0 || words.length == 1) return true;
        // String prev = words[0];
        // for (int i = 1 ; i < words.length ; i++) {
        //     if (compare(prev, words[i], order) > 0)
        //         return false;
        //     prev = words[i];
        // }
        // return true;

        // Solution from Nick White
        charMap = new int[26];
        for (int i = 0 ; i < order.length(); i++) {
            charMap[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1 ; i < words.length ; i++) {
            if (compare(words[i - 1], words[i]) > 0) {
                return false;
            }
        }
        return true;
        
    }

    private int compare(String word1, String word2) {
        int i = 0;
        int j = 0;
        int charCompareVal = 0;
        while (i < word1.length() && j < word2.length() && charCompareVal == 0) {
            charCompareVal = charMap[word1.charAt(i) - 'a'] - charMap[word2.charAt(j) - 'a'];
            i++;
            j++;
        }
        if (charCompareVal == 0) {
            return word1.length() - word2.length();
        } else {
            return charCompareVal;
        } 
    }

    // private int compare(String word1, String word2, String order) {
    //     int len1 = word1.length();
    //     int len2 = word2.length();
    //     int len = Math.min(len1, len2);
    //     for (int i = 0 ; i < len ; i++) {
    //         int index1 = order.indexOf(word1.charAt(i));
    //         int index2 = order.indexOf(word2.charAt(i));
    //         if (index1 > index2) return 1;
    //         if (index1 < index2) return -1;
    //     }
    //     if (len1 == len2) return 0;
    //     if (len1 < len2) return -1;
    //     return 1;
    // }
}
// @lc code=end

