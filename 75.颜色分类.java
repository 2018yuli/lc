/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // mine (use Counter Index)
        // int redCount = 0;
        // int whiteCount = 0;
        // int blueCount = 0;
        // for (Integer num : nums) {
        //     if (num == 0) {
        //         redCount++;
        //     } else if (num == 1) {
        //         whiteCount++;
        //     } else if (num == 2) {
        //         blueCount++;
        //     }
        // }
        // int redIndex = redCount;
        // int whiteIndex = redCount + whiteCount;
        // int blueIndex = whiteIndex + blueCount;
        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (i < redIndex) {
        //         nums[i] = 0;
        //     } else if (i < whiteIndex) {
        //         nums[i] = 1;
        //     } else if (i < blueIndex) {
        //         nums[i] = 2;
        //     }
        // }

        // Solution from Nick White
        // swap step by step
        if (nums.length == 0 || nums.length == 1) return;

        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                index++;
            }
        }
    }
}
// @lc code=end

