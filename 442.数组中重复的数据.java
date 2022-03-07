/*
 * @lc app=leetcode.cn id=442 lang=java
 *
 * [442] 数组中重复的数据
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // mine
        // List<Integer> result = new ArrayList<Integer>();
        // boolean[] temp = new boolean[nums.length];
        // for (int i = 0 ; i < nums.length ; i++) {
        //     int val = nums[i];
        //     if (temp[val - 1]) result.add(val);
        //     else temp[val - 1] = true;
        // }
        // return result;

        // Solution from Nick White
        List<Integer> outputArr = new ArrayList<Integer>();
        for (int i = 0 ; i < nums.length ; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) outputArr.add(index + 1);
            nums[index] = - nums[index];
        }
        return outputArr;
    }
}
// @lc code=end

