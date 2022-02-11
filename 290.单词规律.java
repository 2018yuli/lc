/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        // mine
        // int len = pattern.length();
        // String[] strs = s.split(" ");
        // if (strs.length != len) return false;
        // Map<Character, String> middleMap = new HashMap<Character, String>();
        // for (int i = 0 ; i < len ; i++) {
        //     char c = pattern.charAt(i);
        //     String str = strs[i];
        //     if (!middleMap.containsKey(c)) {
        //         if (middleMap.values().contains(str)) return false;
        //         middleMap.put(c, str);
        //     } else {
        //         if (!str.equals(middleMap.get(c))) return false;
        //     }
        // }
        // return true;

        // Solution from Nick White
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for (int i = 0 ; i < words.length ; i++) {
            char currentChar = pattern.charAt(i);
            if (map.containsKey(currentChar)) {
                // <a, dog> <a, cat>
                if (!map.get(currentChar).equals(words[i])) return false;
            } else {
                // <a, dog> <b, dog>
                if (map.containsValue(words[i])) return false;
                map.put(currentChar, words[i]);
            }
        }
        return true;
    }
}
// @lc code=end

