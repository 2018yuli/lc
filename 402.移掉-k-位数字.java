/*
 * @lc app=leetcode.cn id=402 lang=java
 *
 * [402] 移掉 K 位数字
 */

// @lc code=start
class Solution {
    public String removeKdigits(String num, int k) {
        // mine o(￣┰￣*)ゞ
        // String result = "";
        // if (k >= num.length()) return "0";
		
		// while (k > 0 && num.length() > 0) {
		// 	int len = Math.min(k, num.length() - 1);
		// 	int min = Integer.MAX_VALUE;
		// 	int minIndex = 0;
		// 	for (int i = 0 ; i <= len ; i++) {
		// 		if (num.charAt(i) < min) {
		// 			min = num.charAt(i);
		// 			minIndex = i;
		// 		}
		// 	}
		// 	// 最小高位
		// 	if (minIndex == 0) {
		// 		result += num.substring(0, 1);
		// 		num = num.substring(1);
		// 	}else {
		// 		num = num.substring(minIndex);
		// 		k -= minIndex;
		// 	}
		// }
		// // 切除首位 0
		// while ("".equals(result) && num.length() > 0) {
		// 	if (num.charAt(0) == '0') {
		// 		num = num.substring(1);
		// 	}else {
		// 		break;
		// 	}
		// }
		
		// return "".equals(result + num) ? "0" : (result + num);
        
        // Solution from Nick White
		// Greedy Algorithm Looping through the String once
		int size = num.length();
		if (k == size) return "0";
		
		Stack<Character> stack = new Stack<Character>();
		// do stuff with putting nums on stack
		int counter = 0;
		while (counter < size) {
			
			while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)) {
				stack.pop();
				k--;
			}
			
			stack.push(num.charAt(counter++));
		}
		
		while (k > 0) {
			stack.pop();
			k--;
		}
		
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			char currchar = stack.pop();
			sb.append(currchar);
		}
		sb.reverse();
		// remove zero
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
    }
}
// @lc code=end

