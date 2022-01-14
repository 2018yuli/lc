/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // // mine
        // int[] result = new int[]{-1, -1};
        // if (nums.length == 0) return result;
        // int start = 0;
        // int end = nums.length - 1;
        // int mid = (end + start)/2;
        // while (nums[mid]!=target && start < end) {
            
        //     if (nums[mid] < target) {
        //         start = mid + 1;
        //     }
        //     else if (nums[mid] > target) {
        //         end = mid - 1;
        //     }
        //     mid = (end + start)/2;
        // }
        // if (nums[mid] == target) {
        //     result[0] = mid;
        //     while (result[0] > 0 && nums[result[0] - 1] == target) {
        //         result[0] -= 1;
        //     }
        //     result[1] = mid;
        //     while (result[1] < nums.length - 1 && nums[result[1] + 1] == target) {
        //         result[1] += 1;
        //     }
        // }
        // return result;

        // Solution from Nick White
        int[] result = new int[2];
        // 已有的算法，二分法，可再分，所以拆分为两个函数
        result[0] = findStartIndex(nums, target);
        result[1] = findEndIndex(nums, target);
        return result;
    }

    public int findStartIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] >= target) {
                end = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }

    public int findEndIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] <= target) {
                start = midPoint + 1;
            } else {
                end = midPoint - 1;
            }
            
            if (nums[midPoint] == target) index = midPoint;
        }
        return index;
    }
}


// @lc code=end

