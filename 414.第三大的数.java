/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        // mine
        // Arrays.sort(nums);
        // int max = nums[nums.length - 1];
        // int num = 1;
        // for (int i = nums.length - 1 ; i >= 0 ; i--) {
        //     if (nums[i] < max) {
        //         max = nums[i];
        //         num++;
        //     }
        //     if (num == 3) return nums[i];
        // }
        // return nums[nums.length - 1];

        // mine 2
        // List<Integer> list = new ArrayList<Integer>();
        
        // for (int i = 0 ; i < nums.length ; i++) {
        //     int num = nums[i];
        //     if (list.isEmpty() || list.get(0) < num) {
        //         list.add(0, num);
        //     } else if (list.get(0) == num) {
        //         continue;
        //     } else if (list.size() == 1) {
        //         list.add(1, num);
        //     } else if (list.get(1) < num) {
        //         list.add(1, num);
        //     } else if (list.get(1) == num) {
        //         continue;
        //     } else if (list.size() == 2) {
        //         list.add(2, num);
        //     } else if (list.get(2) < num) {
        //         list.add(2, num);
        //     }
        // }
        // if (list.size() < 3) return list.get(0);
        // return list.get(2);

        // Solution from Nick White
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {

            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null) return max;
        return thirdMax;
    }
}
// @lc code=end

