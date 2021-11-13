/*
 * @lc app=leetcode.cn id=561 lang=java
 *
 * [561] 数组拆分 I
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        // Solution from Nick White
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length ; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
// @lc code=end

