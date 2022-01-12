/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心下标
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        // mine
        // int n = nums.length;
        // int[] sums = new int[n];
        // int sum = 0;
        // for (int i = 0 ; i < n ; i++) {
        //     sum += nums[i];
        //     sums[i] = sum;
        // }
        // for (int i = 0 ; i < n ; i++) {
        //     int left = i - 1 < 0 ? 0 : sums[i - 1];
        //     int right = i + 1 == n ? 0 : sums[n - 1] - (left + nums[i]);
        //     if (left == right) return i;
        // }
        // return -1;

        // Solution from Nick White
        int totalSum = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (i != 0) leftSum += nums[i - 1];
            if (totalSum - leftSum - nums[i] == leftSum)
                return i;
        }
        return -1;
    }
}
// @lc code=end

