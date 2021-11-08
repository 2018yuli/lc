/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // solution from Nick White
        // int[] newArr = new int[nums.length];
        // int counter = 0;

        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (nums[i] % 2 == 0) {
        //         newArr[counter++] = nums[i];
        //     }
        // }
        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (nums[i] % 2 == 1) {
        //         newArr[counter++] = nums[i];
        //     }
        // }
        // return newArr;

        // solution from Nick White
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }
        return nums;
    }
}
// @lc code=end

