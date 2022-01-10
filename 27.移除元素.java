/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // mine
        // int start = 0;
        // int end = nums.length - 1;
        // while (start <= end) {
        //     while (start <= end && nums[start] != val) {
        //         start++;
        //     }
        //     while (end >= 0 && nums[end] == val) {
        //         end--;
        //     }
        //     if (start < end) {
        //     	int temp = nums[start];
        //     	nums[start] = nums[end];
        //     	nums[end] = temp;
        //     }
        // }
        // return start;

        // Solution from Nick White
        if (nums.length == 0) return 0;
        int validSize = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[validSize] = nums[i];
                validSize++;
            }
        }
        return validSize;
    }
}
// @lc code=end

