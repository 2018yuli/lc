/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // mine
        // a b c a b c a b c a b c ...
        // List<Integer> ret = new ArrayList<Integer>();
        // if (p.length() > s.length()) return ret;

        // int len = p.length();

        // Map<Character, Integer> target = new HashMap<Character, Integer>();
        // for (int i = 0 ; i < len ; i++) {
        //     target.put(p.charAt(i), target.getOrDefault(p.charAt(i), 0) + 1);
        // }

        // Map<Character, Integer> words = new HashMap<Character, Integer>();
        // for (int i = 0 ; i < len ; i++) {
        // 	words.put(s.charAt(i), words.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // int start = 0;
        // if (sameWords(words, target))
        //     ret.add(start);
        // for (int end = len ; end < s.length() ; end++) {
            
        //     char c = s.charAt(end);
        //     words.put(c, words.getOrDefault(c, 0) + 1);
        //     char c1 = s.charAt(start);
        //     words.put(c1, words.getOrDefault(c1, 0) - 1);

        //     if (sameWords(words, target))
        //         ret.add(start + 1);

        //     start++;
        // }
        // return ret;

        // solution from Nich White
        List<Integer> result = new ArrayList<Integer>();

        if (s == null || s.length() == 0) return result;

        int[] charCount = new int[26];
        for (char c : p.toCharArray()) {
            charCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {
            // modify charCount directly
            if (charCount[s.charAt(right++) - 'a']-- >= 1) {
                count --;
            }

            if (count == 0) result.add(left);

            if (right - left == p.length() && charCount[s.charAt(left++) - 'a']++ >= 0) {
                count ++;
            }
        }

        return result;
    }

    // 计算两个序列中有相同的单词
    // private boolean sameWords(Map<Character, Integer> words, Map<Character, Integer> target) {
    //     for (char c : target.keySet()) {
    //         if (target.get(c).intValue() != words.getOrDefault(c, -1).intValue()) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
// @lc code=end

