/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // mine abacad abacad abacad || abacad abacad abacad
        // int start = 0;
        // int end = 1;
        // int len = s.length();
        // int maxLen = 1;

        // while (end < len) {
        //     if (s.charAt(start) == s.charAt(end)) {
        //         start++;
        //     } else {
        //         maxLen = Math.max(maxLen, end - start + 1);
        //         start = 0;
        //     }
        //     end++;
        // }
        // if (end - start == maxLen && start >= maxLen)
        //     return true;
        
        // return false;

        // Solution from Nick White
        // split and compare
        int len = s.length();

        for (int i = len / 2 ; i >= 1 ; i--) {
            if (len % i == 0) {
                int numRepeats = len / i;
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0 ; j < numRepeats ; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
// @lc code=end

