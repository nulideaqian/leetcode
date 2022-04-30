package org.galaxy.goahead;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/4/30 18:22
 */
public class Solution0022 {

  public List<String> generateParenthesis(int n) {
    List<String> result = new LinkedList<>();
    dfs(result, 0, 0, n * 2, "");
    return result;
  }

  private void dfs(List<String> result, int leftCount, int rightCount, int maxCount, String curr) {
    if (leftCount < rightCount || leftCount + rightCount > maxCount) {
      return;
    }
    if (leftCount + rightCount == maxCount && leftCount == rightCount) {
      result.add(curr);
    }
    dfs(result, leftCount + 1, rightCount, maxCount, curr + "(");
    dfs(result, leftCount, rightCount + 1, maxCount, curr + ")");
  }
}
