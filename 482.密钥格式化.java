/*
 * @lc app=leetcode.cn id=482 lang=java
 *
 * [482] 密钥格式化
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // mine
        // StringBuilder sb = new StringBuilder();
        // int count = 0;
        // for (int i = s.length() - 1 ; i >= 0 ; i--) {
        //     char c = s.charAt(i);
        //     //
        //     if(count == k){
        //         sb.append('-');
        //         count = 0;
        //     }
        //     //
        //     if ('-' == c) {
        //         continue;
        //     } else if (c >= 'a') {
        //         sb.append((char)(c - 32) + "");
        //         count++;
        //     } else {
        //         count++;
        //         sb.append(c);
        //     }

        // }
        // if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
        // 	sb.deleteCharAt(sb.length() - 1);
        // }
        // sb.reverse();
        // return sb.toString();

        // Solution from Nick White
        s = s.toUpperCase();
        s = s.replaceAll("-", "");

        StringBuilder sb = new StringBuilder(s);

        for (int i = s.length() - k ; i > 0 ; i = i - k) {
            sb.insert(i, "-");
        }
        return sb.toString();
    }
}
// @lc code=end

