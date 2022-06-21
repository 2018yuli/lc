/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        // mine
        // if (s.length() == 0) return true;
        // int index = 0;
        // int len = t.length();
        // char sChar = s.charAt(index);
        // for (int i = 0 ; i < len ; i++) {
        //     char c = t.charAt(i);
           
        //     if (c == sChar) {
        //          if (index + 1 == s.length()) return true;
        //         sChar = s.charAt(++index);
        //     }
        // }
        // return false;

        // Solution from Nick White
        if (s.length() == 0) return true;

        int sPoint = 0;
        int tPoint = 0;
        while (tPoint < t.length()) {

            if (t.charAt(tPoint) == s.charAt(sPoint)) {
                sPoint ++;
                if (sPoint == s.length()) {
                    return true;
                }
            }

            tPoint++;
        }
        return false;
    }
}
// @lc code=end

