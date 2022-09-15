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
        List<Integer> ret = new ArrayList<Integer>();
        if (p.length() > s.length()) return ret;

        int len = p.length();

        Map<Character, Integer> target = new HashMap<Character, Integer>();
        for (int i = 0 ; i < len ; i++) {
            target.put(p.charAt(i), target.getOrDefault(p.charAt(i), 0) + 1);
        }

        Map<Character, Integer> words = new HashMap<Character, Integer>();
        for (int i = 0 ; i < len ; i++) {
        	words.put(s.charAt(i), words.getOrDefault(s.charAt(i), 0) + 1);
        }
        int start = 0;
        if (sameWords(words, target))
            ret.add(start);
        for (int end = len ; end < s.length() ; end++) {
            
            char c = s.charAt(end);
            words.put(c, words.getOrDefault(c, 0) + 1);
            char c1 = s.charAt(start);
            words.put(c1, words.getOrDefault(c1, 0) - 1);

            if (sameWords(words, target))
                ret.add(start + 1);

            start++;
        }
        return ret;

        // TODO
    }

    // 计算两个序列中有相同的单词
    private boolean sameWords(Map<Character, Integer> words, Map<Character, Integer> target) {
        for (char c : target.keySet()) {
            if (target.get(c) != words.getOrDefault(c, -1)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

