/*
 * @lc app=leetcode.cn id=1249 lang=java
 *
 * [1249] 移除无效的括号
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        // mine
        List<Character> list = Arrays.asList(s.toCharArray());

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0 ; i < list.size() ; i++) {
            char c = list.get(i);
            
            if (c == '(') {
                stack.push(i);
            }
            if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    list.remove(i);
                    i--;
                }
            }
        }
        while (!stack.isEmpty()) {
            list.remove(stack.pop());
        }
        StringBuilder sb = new StringBuilder(list.size());
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

