/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // mine
        // int result = 0;
        // Arrays.sort(g);
        // Arrays.sort(s);
        // int j = 0;
        // for (int i = 0 ; i < g.length ; i++) {
        //     while (j < s.length) {
        //         if (s[j] >= g[i]) {
        //             result++;
        //             j++;
        //             break;
        //         }
        //         j++;
        //     }
        //     if (j >= s.length) break;
        // }
        // return result;

        // Solution from Nick White
        Arrays.sort(g);
        Arrays.sort(s);

        int aPoint = 0;
        int bPoint = 0;

        while (aPoint < g.length && bPoint < s.length) {
            if (g[aPoint] <= s[bPoint]) {
                aPoint++;
                bPoint++;
            } else {
                bPoint++;
            }
        }
        return aPoint;
    }
}
// @lc code=end

