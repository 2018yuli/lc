/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {

        // mine O(log n) 考虑二分法
        // int start = 0;
        // int end = nums.length - 1;
        // int middle = start + (end - start) / 2;
        // while (start < end) {
        //     if (nums[middle]  < nums[start]) {
        //         end = middle;
        //         start = start + 1;
        //     }
        //     else if (nums[middle] > nums[end]) {
        //         start = middle + 1;
        //     }
        //     else {
        //         end = middle - 1;
        //     }
        //     middle = start + (end - start) / 2;
        // }
        // return nums[middle];

        // Solution from Nick White
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middlePoint = left + (right - left) / 2;
            if (middlePoint > 0 && nums[middlePoint] < nums[middlePoint - 1]) {
                return nums[middlePoint];
            } else if (nums[left] <= nums[middlePoint] && nums[middlePoint] > nums[right]) {
                left = middlePoint + 1;
            } else {
                right = middlePoint - 1;
            }
        }
        return nums[left];
    }
}
// @lc code=end

