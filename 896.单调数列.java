/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        // mine
        // if (nums.length == 1) return true;
        // Boolean raise = nums[nums.length - 1] > nums[0];
        // for (int i = 1 ; i < nums.length ; i++) {
        //     if (!raise && nums[i] > nums[i - 1])
        //         return false;
        //     if (raise && nums[i] < nums[i - 1])
        //         return false;
        // }
        // return true;

        // Solution from Nick White
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0 ; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) increasing = false;
            if (nums[i] < nums[i + 1]) decreasing = false;
        }
        return increasing || decreasing;
    }
}
// @lc code=end

