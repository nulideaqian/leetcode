package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/3/12 23:21
 */
public class Solution0122 {

  public int maxProfit(int[] prices) {
    // 边界情况
    if (prices.length == 1 || prices.length == 0) {
      return 0;
    }
    // 标志位低买点 高买点
    int result = 0;
    int money = -1;
    for (int i = 0; i < prices.length; i++) {
      // 起始节点
      if (i == 0) {
        if (prices[i] < prices[i + 1]) {
          money = prices[i];
        }
        continue;
      }
      // 结束节点
      if (i == prices.length - 1) {
        if (prices[i] > prices[i - 1] && money != -1) {
          result += prices[i] - money;
        }
        continue;
      }
      // 普通节点
      if (prices[i] <= prices[i - 1] && prices[i] < prices[i + 1]) {
        money = prices[i];
      }
      if (prices[i] > prices[i - 1] && prices[i] >= prices[i + 1] && money != -1) {
        result += prices[i] - money;
        money = -1;
      }
    }
    return result;
  }

}
