/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        // mine 求所有子集
        // ["((()))","(()())","(())()","()(())","()()()"]
        // {{3}, {2}, {1}, {1}, {2}, {3}}, 
        // {{3}, 1, 1, 2, 2, {3}},  // 把 2 合并
        // {{2}, 1, 1, {2}, 3, 3},  // 把 3 合并
        // {3, 3, {2}, 1, 1, {2}},  // 把 3 合并 
        // {1, 1, 2, 2, 3, 3}       // 吧 2 和 3 合并
        // 即为，将第 3 个括号抽出来，加入剩下的 元素 的间隙之间

        // ["((()))","(()())","(())()","()(())","()()()"]
        //
        //  () () ()
        //
        //     () ()
        //   ()
        //
        //   () ()
        //        ()
        //
        //     ()
        //   ()  ()
        //
        //     ()
        //   ()
        // ()

        // Solution from Nich White
        List<String> outputArr = new ArrayList<String>();
        backtrack(outputArr, "", 0, 0, n);
        return outputArr;
    }

    private void backtrack(List<String> outputArr, String currentStr, int open, int close, int max) {
        if (currentStr.length() == max * 2) {
            outputArr.add(currentStr);
            return;
        }

        if (open < max) {
            backtrack(outputArr, currentStr + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(outputArr, currentStr + ")", open, close + 1, max);
        }
    }
}
// @lc code=end

