/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // mine
        // if (nums.length == 0) return 0;
        // int max = 0;
        // // int currentNum = nums[0];
        // int currentCount = 0;
        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (nums[i] == 1) {
        //         currentCount++;
        //     } else {
        //         max = Math.max(currentCount, max);
        //         // currentNum = nums[i];
        //         currentCount = 0;
        //     }
        // }
        // return Math.max(currentCount, max);

        // Solution from Nick White
        int max = 0;
        int currentNumberOfOnes = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 1) {
                currentNumberOfOnes += 1;
                max = Math.max(currentNumberOfOnes, max);
            } else {
                currentNumberOfOnes = 0;
            }
        }
        return max;
    }
}
// @lc code=end

