/*
 * @lc app=leetcode.cn id=856 lang=java
 *
 * [856] 括号的分数
 */

// @lc code=start
class Solution {

    public int scoreOfParentheses(String s) {
        // mine1
        // int len = s.length();
        // int i = 0;

        // int num = 0;
        // Stack<Integer> stack = new Stack<Integer>();
        // while (i < len) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //     	if (num != 0) {
        //     		stack.push(num);
        //     		num = 0;
        //     	}
        //         stack.push((int)'(');                                       
        //     }
        //     if (c == ')') {
        //         num = 0;
        //         boolean flag = false;
        //         while (!stack.isEmpty()) {
        //             char cc = (char) stack.peek().intValue();
        //             if (cc == '(') {
        //             	if (flag) {
        //             		stack.push(num);
        //                     num = 0;
        //             		break;
        //             	}
        //             	num = num == 0 ? 1 : 2 * num;
        //             	flag = true;
        //             }
        //             else {
        //                 num += cc;
        //             }
        //             stack.pop();
        //         }
        //     }
        //     i++;
        // }
        // while (!stack.isEmpty()) {
        // 	num += stack.pop();
        // }
        // return num;

        // mine2
        // (*(+ (
        // ((((((())))()())))
        // <=> (1*2*2*2+1+1)*2*2*2
        // int level = 0;
        // List<Integer> levels = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //         level++;
        //     }
        //     if (c == ')') {
        //         level--;
        //         levels.add(level);
        //     }
        // }
        // Collections.sort(levels);
        // int sum = 1;
        // int lastLevel = levels.get(levels.size() - 1);
        // for (int i = levels.size() - 2 ; i >= 0 ; i--) {
        //     level = levels.get(i);
            
        //     if (level == lastLevel) {
        //         sum += 1;    
        //     }else { 
        //         sum *= 2;
        //     }
        //     lastLevel = level;
        // }

        // return sum;

        // mine3
        // ((((((())))()())))
        // <=> 
        //       1
        //       1   
        //       1
        //    1  1  1
        //    1
        //    1
        //    1
       return score(s);
    }

    private int score(String s) {
        List<Integer> separator = new ArrayList<>();
        
        int level = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                level++;
            }
            if (c == ')') {
                level--;
            }
            if (level == 0) {
            	if (i == 0) continue;
            	if (i == s.length() - 1 && separator.isEmpty()) continue;
                separator.add(i);
            }
        }
        
        if (separator.isEmpty()) {
        	if (s.equals("()")) {
                return 1;
            }
            else if (s.startsWith("((") && s.endsWith("))")) {
                return 2* scoreOfParentheses(s.substring(1, s.length() - 1));
            }
            else if (s.startsWith("()")) {
                return 1 + scoreOfParentheses(s.substring(2));
            }
            else if (s.endsWith("()")) {
                return 1 + scoreOfParentheses(s.substring(0, s.length() - 2));
            } else {
            	return 0;
            }
        }
        else {
            int sum = 0;
            int prev = 0;
            for (int i : separator) {
                sum += scoreOfParentheses(s.substring(prev, i + 1));
                prev = i + 1;
            }
            return sum;
        }
    }
}
// @lc code=end

