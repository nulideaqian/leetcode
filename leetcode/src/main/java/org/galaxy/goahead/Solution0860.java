package org.galaxy.goahead;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Galaxy
 * @since 2022/3/5 1:19
 */
public class Solution0860 {

  public boolean lemonadeChange(int[] bills) {
    Map<Integer, Integer> balanceMap = new HashMap<>();
    balanceMap.put(5, 0);
    balanceMap.put(10, 0);
    balanceMap.put(20, 0);
    for (int i = 0; i < bills.length; i++) {
      int bill = bills[i];
      // 1. new bill more than (index + 1) * 5
      if (bill > (i + 1) * 5) {
        return false;
      }
      if (bill == 10) {
        if (balanceMap.get(5) > 0) {
          balanceMap.put(5, balanceMap.get(5) - 1);
          balanceMap.put(10, balanceMap.get(10) + 1);
        } else {
          return false;
        }
      } else if (bill == 20) {
        if (balanceMap.get(10) > 0 && balanceMap.get(5) > 0) {
          balanceMap.put(5, balanceMap.get(5) - 1);
          balanceMap.put(10, balanceMap.get(10) - 1);
          balanceMap.put(20, balanceMap.get(20) + 1);
        } else if (balanceMap.get(10) > 0 && balanceMap.get(5) == 0) {
          return false;
        } else if (balanceMap.get(10) == 0 && balanceMap.get(5) >= 3) {
          balanceMap.put(5, balanceMap.get(5) - 3);
          balanceMap.put(20, balanceMap.get(20) + 1);
        } else {
          return false;
        }
      } else {
        balanceMap.put(5, balanceMap.get(5) + 1);
      }
    }
    return true;
  }

}
