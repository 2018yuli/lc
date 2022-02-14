/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // mine
        // if (s.length() != t.length()) return false;
        // Map<Character, Integer> counter = new HashMap<Character, Integer>();
        // for (char c : s.toCharArray()) {
        //     int count = counter.getOrDefault(c, 0);
        //     counter.put(c, ++count);
        // }
        // for (char c : t.toCharArray()) {
        //     int count = counter.getOrDefault(c, 0);
        //     if (count == 0) return false;
        //     if (count == 1) counter.remove(c);
        //     else counter.put(c, --count);
        // }
        // return counter.isEmpty();

        // Solution from Nick White
        if (s.length() != t.length()) return false;
        int[] charCounts = new int[26];
        for (int i = 0 ; i < s.length() ; i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        for (int count : charCounts) {
            if (count != 0) return false;
        }
        return true;
    }
}
// @lc code=end

