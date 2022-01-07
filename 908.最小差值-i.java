/*
 * @lc app=leetcode.cn id=908 lang=java
 *
 * [908] 最小差值 I
 */

// @lc code=start
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        // mine
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     if (num < min) min = num;
        //     if (num > max) max = num;
        // }
        // int result = max - min - 2 * k;
        // return result < 0 ? 0 : result;

        // Solution from Nick White
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        
        if (min + k >= max - k) {
            return 0;
        } else {
            return (max - k) - (min + k);
        }
    }
}
// @lc code=end

