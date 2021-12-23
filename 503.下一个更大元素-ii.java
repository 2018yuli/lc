/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // mine , use Index "i" instead of the number
        // HashMap<Integer, Integer> nextGreatest = new HashMap<Integer, Integer>();
        // Stack<Integer> stack = new Stack<Integer>();

        // for (int i = 0 ; i < nums.length ; i++) {
        //     int num = nums[i];
        //     while (!stack.isEmpty() && nums[stack.peek()] < num) {
        //         nextGreatest.put(stack.pop(), num);
        //     } 
        //     stack.push(i);
        // }
        // for (Integer num : nums) {
        //     while (!stack.isEmpty() && nums[stack.peek()] < num) {
        //         nextGreatest.put(stack.pop(), num);
        //     } 
        // }
        // for (int i = 0 ; i < nums.length ; i++) {
        //     nums[i] = nextGreatest.getOrDefault(i, -1);
        // }
        // return nums;

        // Solution from Nick White
        // there is no need for HashMap now
        int n = nums.length;
        int[] outputArr = new int[n];
        Arrays.fill(outputArr, -1);

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0 ; i < n * 2 ; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                outputArr[stack.pop()] = nums[i % n];
            }
            if (i < n) stack.push(i);
        }
        return outputArr;
    }
}
// @lc code=end

