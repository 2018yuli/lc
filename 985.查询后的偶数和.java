/*
 * @lc app=leetcode.cn id=985 lang=java
 *
 * [985] 查询后的偶数和
 */

// @lc code=start
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        // Solution from Nick White
        int[] result = new int[nums.length];

        int counter = 0;
        int sum = 0;

        while (counter < result.length) {

            int val = queries[counter][0];
            int index = queries[counter][1];
            nums[index] += val;
            //
            for (int i = 0 ; i < nums.length ; i++) {
                if (nums[i] % 2 == 0) {
                    sum += nums[i];
                }
            }
            //
            result[counter] = sum;
            counter++;
            sum = 0;
        }
        return result;
    }
}
// @lc code=end

