/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // mine
        // Map<Integer, Integer> nextGreaterMap = new HashMap<Integer, Integer>();
        // Stack<Integer> stack = new Stack<Integer>();
        
        // for (int num : nums2) {
        //     while (!stack.isEmpty()) {
        //         int ele = stack.peek();
        //         if (ele < num) {
        //             stack.pop();
        //             nextGreaterMap.put(ele, num);
        //         } else {
        //             break;
        //         }
        //     }
        //     stack.add(num);
        // }

        //  while (!stack.isEmpty()) {
        //     int ele = stack.pop();
        //     nextGreaterMap.put(ele, -1);
        // }

        // int[] result = new int[nums1.length];
        // for (int i = 0 ; i < nums1.length ; i++) {
        //     result[i] = nextGreaterMap.get(nums1[i]);
        // }
        // return result;

        // Solution from Nick White
        HashMap<Integer, Integer> nextGreatest = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for (Integer num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreatest.put(stack.pop(), num);
            } 
            stack.push(num);
        }

        for (int i = 0 ; i < nums1.length ; i++) {
            nums1[i] = nextGreatest.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
// @lc code=end

