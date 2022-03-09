/*
 * @lc app=leetcode.cn id=735 lang=java
 *
 * [735] 行星碰撞
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // mine
        // int left = 0;
        // int right = 1;
        // int boomNum = 0;
        // while (right < asteroids.length) {
        //     while (left < asteroids.length && asteroids[left] <= 0) {
        //         left++;
        //     }
        //     right = left + 1;
        //     while (right < asteroids.length && asteroids[right] >= 0) {
        //         right++;
        //     }
        //     left = right - 1;
        //     while (left >= 0 && left <asteroids.length && asteroids[left] <= 0) {
        //         left--;
        //     }
        //     if (left < 0 || right >= asteroids.length)
        //         break;
        //     if (asteroids[left] > 0 && asteroids[right] < 0) {
        //         if (asteroids[left] + asteroids[right] > 0) {
        //             asteroids[right] = 0;
        //             boomNum++;
        //         }
        //         else if (asteroids[left] + asteroids[right] == 0) {
        //             asteroids[left] = 0;
        //             asteroids[right] = 0;
        //             boomNum += 2;
        //         }
        //         else if (asteroids[left] + asteroids[right] < 0) {
        //             asteroids[left] = 0;
        //             boomNum++;
        //         }
        //         left = 0;
        //         right = 1;
        //     }
        // }
        // int[] outputArr = new int[asteroids.length - boomNum];
        // int j = 0;
        // for (int i = 0 ; i < asteroids.length ; i++) {
        //     if (asteroids[i] != 0)
        //         outputArr[j++] = asteroids[i];
        // }
        // return outputArr;

        // Solution from Nick White
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0 ; i < asteroids.length ; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (true) {
                    int peek = stack.peek();
                    if (peek < 0) {
                        stack.push(asteroids[i]);
                        break;
                    } else if (peek == -asteroids[i]) {
                        stack.pop();
                        break;
                    } else if (peek > -asteroids[i]) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }

        }
        int[] outputArr = new int[stack.size()];
        for (int i = outputArr.length - 1 ; i >= 0 ; i--) {
            outputArr[i] = stack.pop();
        }
        return outputArr;
    }
}
// @lc code=end

