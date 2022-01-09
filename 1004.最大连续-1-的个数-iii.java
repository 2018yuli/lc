/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        // mine
        // int result = 0;
        // int count = 0;
        // int start = 0;
        // int zeroCount = 0;
        // for (int i = 0 ; i < nums.length ; i++) {
        // 	count++;
        //     if (nums[i] == 0) {
        //     	zeroCount++;
        //         if (zeroCount > k) {
        //             for (int j = start ; j <= i ; j++) {
        //                 start++;
        //                 count--;
        //                 if (nums[j] == 0) {
        //                 	zeroCount--;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        //     result = Math.max(result, count);
        // }
        // return result;

        // Solution from Nick White
        // i - j will keep the longest and keep going
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0) {
                if (nums[j] == 0) {
                    k++;
                }
                j++;
            }
            i++;
        }
        return i - j;
    }
}
// @lc code=end

