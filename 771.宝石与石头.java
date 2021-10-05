/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // solution from Nick White
        int jewelsCount = 0;
        int len = stones.length();
        for (int i = 0 ; i < len; i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                jewelsCount++;
            }
        }
        return jewelsCount;
    }
}
// @lc code=end

