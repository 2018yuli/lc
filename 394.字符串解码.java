/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        // mine
        // char[] sArr = s.toCharArray();
        // Stack<Character> stack = new Stack<Character>();
        // Stack<Integer> rates = new Stack<Integer>();
        // StringBuilder result = new StringBuilder();
        // int k = 0;
        // int level = 0;
        // for (char c : sArr) {
        //     if (level == 0 && Character.isAlphabetic(c)) {
        //     	result.append(c);
        //     }
        //     if (Character.isDigit(c)) {
        //     	k = (c - '0') + 10 * k;
        //     }
        //     else if (c == '[') {
        //     	rates.push(k);
        //     	k = 0;
        //     	stack.push(c);
        //     	level++;
        //     }
        //     else if (c == ']') {
        //     	level--;
        //     	StringBuilder ss = new StringBuilder();
        //     	while (stack.peek() != '[') {
        //     		ss.append(stack.pop());
        //     	}
        //     	if (stack.peek() == '[') stack.pop();
            	
        //     	ss = ss.reverse();
        //     	int rate = rates.pop();
        //     	StringBuilder sss = new StringBuilder();
        //     	for (int i = 0 ; i < rate ; i++) {
        //     		sss.append(ss);
        //     	}
        //     	if (level > 0) {
        //     		for (int i = 0 ; i < sss.length(); i++) {
        //     			stack.push(sss.charAt(i));
        //     		}
        //     	}else {
        //     		result.append(sss);            		
        //     	}
        //     }
        //     else if (level > 0) {
        //     	stack.push(c);
        //     }
        // }
        // return result.toString();

        // Solution from Nick White
        Stack<Integer> counts = new Stack<Integer>();
        Stack<String> result  = new Stack<String>();
        String res = "";
        int index = 0;

        while (index < s.length()) {

            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index += 1;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0 ; i < count ; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index);
                index += 1;
            }

        }
        return res;
    }
}
// @lc code=end

