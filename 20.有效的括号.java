/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        // mine
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
            if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
            if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;

        // Solution from Nick White
        // if (s.length() % 2 != 0) return false;
        
        // Stack<Character> stack = new Stack<Character>();
        // for (char c : s.toCharArray()) {
        //     if (c == '(' || c == '{' || c == '[') {
        //         stack.push(c);
        //     }
        //     else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
        //         stack.pop();
        //     }
        //     else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
        //         stack.pop();
        //     }
        //     else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
        //         stack.pop();
        //     }
        // }
        // return stack.isEmpty();
    }
}
// @lc code=end

