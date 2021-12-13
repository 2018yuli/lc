/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    private Map<String, String[]> keyBoard = new HashMap<String, String[]>(){{
        put("2", new String[]{"a", "b", "c"});
        put("3", new String[]{"d", "e", "f"});
        put("4", new String[]{"g", "h", "i"});
        put("5", new String[]{"j", "k", "l"});
        put("6", new String[]{"m", "n", "o"});
        put("7", new String[]{"p", "q", "r", "s"});
        put("8", new String[]{"t", "u", "v"});
        put("9", new String[]{"w", "x", "y", "z"});
    }};
    public List<String> letterCombinations(String digits) {
        // mine
        // List<String> result = new ArrayList<String>();
        // int len = digits.length();
        // for (int i = len - 1 ; i >= 0 ; i--) {
        //     String key = digits.charAt(i) + "";
        //     List<String> temp = new ArrayList<String>();
        //     for (String s : keyBoard.get(key)) {
        //         if (i == len - 1) {
        //         	temp.add(s);
        //         } else {
        //             for (int j = 0 ; j < result.size() ; j++) {
        //             	temp.add(j, s + result.get(j));
        //             }
        //         }
        //     }
        //     result = temp;
        // }
        // return result;

        // Solution from Nick White
        LinkedList<String> ourtPutArr = new LinkedList<String>();
        if (digits.length() == 0) return ourtPutArr;
        ourtPutArr.add("");
        String[] charMap = new String[]{"0", "1",
            "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0 ; i < digits.length() ; i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (ourtPutArr.peek().length() == i) {
                String permutation = ourtPutArr.remove();
                for (char c : charMap[index].toCharArray()) {
                    ourtPutArr.add(permutation + c);
                }
            }
        }
        return ourtPutArr;
    }
}
// @lc code=end

