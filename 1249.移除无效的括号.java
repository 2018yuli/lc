/*
 * @lc app=leetcode.cn id=1249 lang=java
 *
 * [1249] 移除无效的括号
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        // mine
        // char[] charArray = s.toCharArray();
        // List<Character> list = new ArrayList<Character>(s.length());
        // for (char c : charArray) {
        // 	list.add(c);
        // }

        // Stack<Integer> stack = new Stack<Integer>();
        // List<Integer> mark = new ArrayList<Integer>();

        // for (int i = 0 ; i < list.size() ; i++) {
        //     char c = list.get(i);
            
        //     if (c == '(') {
        //         stack.push(i);
        //     }
        //     if (c == ')') {
        //         if (!stack.isEmpty()) {
        //             stack.pop();
        //         } else {
        //             mark.add(i);
        //         }
        //     }
        // }
        // mark.addAll(stack);
        // for (int i = 0 ; i < mark.size() ; i++) {
        //     list.remove(mark.get(i) - i);
        // }

        // StringBuilder sb = new StringBuilder(list.size());
        // for (char c : list) {
        //     sb.append(c);
        // }
        // return sb.toString();

        // mine2
        // char[] charArray = s.toCharArray();
        // Stack<Integer> stack = new Stack<Integer>();

        // for (int i = 0 ; i < charArray.length ; i++) {
        //     char c = charArray[i];
            
        //     if (c == '(') {
        //         stack.push(i);
        //     }
        //     if (c == ')') {
        //         if (stack.isEmpty())
        //             charArray[i] = '-';
        //         else
        //             stack.pop();
        //     }
        // }
        // while (!stack.isEmpty()) {
        //     charArray[stack.pop()] = '-';
        // }
        // StringBuilder sb = new StringBuilder();
        // for (char c : charArray) {
        //     if (c != '-')
        //         sb.append(c);
        // }
        // return sb.toString();

        // Solution from NickWhite
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0)
                    continue;
                open--;
            }
            sb.append(c);
        }
        StringBuilder ret = new StringBuilder();
        for (int i = sb.length() - 1 ; i >= 0 ; i--) {
            if (sb.charAt(i) == '(' && open -- > 0) 
                continue;
            ret.append(sb.charAt(i));
        }
        return ret.reverse().toString();
    }
}
// @lc code=end

