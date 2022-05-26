/*
 * @lc app=leetcode.cn id=720 lang=java
 *
 * [720] 词典中最长的单词
 */

// @lc code=start
class Solution {
    public String longestWord(String[] words) {
        // mine
        // Arrays.sort(words);
		
        // // 构造多叉树，取树的叶子节点
        // Set<String> leafNodes = new HashSet<String>();
        // List<String> results = new ArrayList<String>();
        // results.add("");
        // leafNodes.add("");
        // for (int i = 0 ; i < words.length ; i++) {
        //     String word = words[i];
        //     String cover = word.substring(0, word.length() - 1);
        //     if (leafNodes.contains(cover)) {
        //     	leafNodes.add(word);
        //     	//
        //     	results.remove(cover);
        //     	results.add(word);
        //     }
            
        // }
        
        // int maxlen = 0;
        // for (String result : results) {
        // 	if (result.length() > maxlen) {
        // 		maxlen = result.length();
        // 	}
        // }
        
        // for (int i = 0 ; i < results.size() ; i++) {
        // 	String result = results.get(i);
        // 	if (result.length() < maxlen) {
        // 		results.remove(i);
        // 		i--;
        // 	}
        // }
        
		// Collections.sort(results);

        // return results.get(0);

        // Solution from Nick WHITE
        Arrays.sort(words);

        HashSet<String> builtWords = new HashSet<String>();
        String result = "";

        for (String w : words) {
            if (w.length() == 1 || builtWords.contains(w.substring(0, w.length() - 1))) {
                if (w.length() > result.length()) result = w;
                builtWords.add(w);
            }
        }

        return result;
    }

   
}
// @lc code=end

