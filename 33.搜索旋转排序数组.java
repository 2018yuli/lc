/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // mine
        // 6,7,0,1,2,4,5
        // if (nums.length == 0) return -1;
        // int low = 0;
        // int high = nums.length - 1;
        // int first = nums[0];
        // int middle = low + (high - low) / 2;
        // while (low < high) {
        //     if (nums[middle] > first) {
        //         low = middle;
        //     }
        //     if (nums[middle] <= first) {
        //         high = middle - 1;
        //     }
        //     middle = low + (high - low) / 2;
        // }
        // int k = middle;
        // if (target >= first) {
        //     return binarySearch(nums, 0, k, target);
        // } else {
        //     return binarySearch(nums, k + 1, nums.length - 1, target);
        // }

        // Solution from Nick White
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;
        // {4,5,6,7,0,1,2} 判断 target in {0,1,2}
        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            }
            else if (nums[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }

        return -1;
    }
    // public int binarySearch(int[] nums, int start, int end, int target) {
    //     int low = start;
    //     int high = end;
    //     while (low <= high) {
    //         int middle = low + (high - low) / 2;
    //         if (nums[middle] > target) {
    //             high = middle - 1;
    //         }
    //         if (nums[middle] < target) {
    //             low = middle + 1;
    //         }
    //         if (nums[middle] == target) return middle;
    //     }
    //     return -1;
    // }
}
// @lc code=end

