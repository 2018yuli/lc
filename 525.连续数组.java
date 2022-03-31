/*
 * @lc app=leetcode.cn id=525 lang=java
 *
 * [525] 连续数组
 */

// @lc code=start
class Solution {
    public int findMaxLength(int[] nums) {
        // mine
        // doMerge: stack [num, start, end]
        // Stack<Integer[]> stack = new Stack<Integer[]>();
        // for (int i = 0 ; i < nums.length ; i++) {
        //     Integer[] current = new Integer[]{nums[i] == 0 ? -1 : nums[i], i, i};
        //     while (!stack.isEmpty()) {
        //         Integer[] prev = stack.pop();
        //         Integer[] pprev = null;
        //         if (!stack.isEmpty())
        //              pprev = stack.peek();
        //         if (prev[0] + current[0] == 0) {
        //             current[0] = 0;
        //             current[1] = prev[1];
        //         } else if (prev[0] == 0 && pprev != null && pprev[0] != 0 && pprev[0] + current[0] == 0) {
        //             stack.pop();
        //             current[0] = 0;
        //             current[1] = pprev[1];
        //         } else {
        //             stack.push(prev);
        //             break;
        //         }
        //     }
        //     stack.add(current);
        // }
        // //
        // int result = 0;
        // while(!stack.isEmpty()) {
        //     Integer[] node = stack.pop();
        //     if (node[0] == 0)
        //         result = Math.max(result, node[2] - node[1] + 1);
        // }
        // return result;

        // Solution from Nick White
        // 连续性问题，计数法
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        counts.put(0, -1);

        int maxLength = 0;
        int count = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) {
                count -= 1;
            } else {
                count += 1;
            }
            if (counts.containsKey(count)) {
                maxLength = Math.max(maxLength, i - counts.get(count));
            } else {
                counts.put(count, i);
            }
        }
        return maxLength;

    }

    
}
// @lc code=end

