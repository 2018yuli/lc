/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int maxVal = Integer.MAX_VALUE;
        int minLen = 0;
        // 从一个 串 中查找最短的连续串
        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (nums[i] > maxVal && nums[i] <= target) {
        //         maxVal = nums[i];
        //     }
        // }

        // Solution from Nick White
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        return result != Integer.MAX_VALUE ? result : 0;
    }
}
// @lc code=end

