/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // mine
        // String commonPrefix = strs[0];
        // int commonPrefixLen = commonPrefix.length();
        // for (int i = 1 ; i < strs.length ; i++) {
        //     String str = strs[i];
        //     int len = Math.min(str.length(), commonPrefixLen);
        //     int j = 0;
        //     for ( ; j < len ; j++) {
        //         if (str.charAt(j) != commonPrefix.charAt(j)) {
        //             break;
        //         }
        //     }
        //     commonPrefix = commonPrefix.substring(0, j);
        //     commonPrefixLen = j;
        //     if ("".equals(commonPrefix)) break;
        // }
        // return commonPrefix;

        // Solution from Nick White
        // 善用已有函数，简化代码
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1 ; i < strs.length ; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
// @lc code=end

