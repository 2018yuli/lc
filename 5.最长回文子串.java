/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        // from source 串
        // to target 特殊 language 回文 从结果反推
        // 思路1：回文=回文判断，太慢
        // 思路2：计数+分治=按唯一存在的字符分割
        // 思路3：递推=按结果逆推

        // 官方解题1：基于source 1、{{S}*{S‘}} 2、回文
        // 官方解题2：基于target 回文=按中心对称={{S左},{S右},{|S左|=|S右|}}
        // 回文可以从它的中心展开，并且只有 2n−1 个这样的中心
        if (s == null || s.length() < 1) return "";
        // 开始，结束
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 以i的左边为中心
            int len1 = expandAroundCenter(s, i, i);
            // 以i为中心
            int len2 = expandAroundCenter(s, i, i + 1);
            // 重新定义i
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
       
}
// @lc code=end

