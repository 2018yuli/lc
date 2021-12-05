/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        // mine
        // int sLen = s.length();
        // int goalLen = goal.length();
        // if (sLen != goalLen) return false;
        
        // for (int i = 0 ; i < sLen ; i++) {
        //     int index = i;
        //     int j = 0;
        //     int matchLen = 0;
        //     while (j < goalLen) {
        //         if (index >= sLen)
        //             index = 0;
        //         if (s.charAt(index++) == goal.charAt(j++)) {
        //             matchLen++;
        //         }else {
        //             break;
        //         }
        //     }
        //     if (matchLen == goalLen) return true;
        // }
        // return false;

        // Solution from Nick White
        return (s.length() == goal.length() && (s + s).contains(goal));
    }
}
// @lc code=end

