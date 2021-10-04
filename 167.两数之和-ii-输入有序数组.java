/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // solution from Nick White
        int apoint = 0;
        int bpoint = numbers.length - 1;

        while (apoint <= bpoint) {
            int sums = numbers[apoint] + numbers[bpoint];
            if (sums > target) {
                bpoint--;
            }else if (sums < target) {
                apoint++;
            }else {
                return new int[] {apoint + 1, bpoint + 1};
            }
        }
        return new int[] {apoint + 1, bpoint + 1};
    }
}
// @lc code=end

