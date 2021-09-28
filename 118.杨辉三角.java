import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // build loop

        // Solution from Nick White
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        
        int row = 1;
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(row);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<Integer>();

            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}
// @lc code=end

