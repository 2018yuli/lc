/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // solution from Nick White
        int result = 0;
        for (int i = 0; i < nums.length ; i++) {
            // XOR a ^ a = 0
            result ^= nums[i];
        }
        return result;
    }
}
// @lc code=end

