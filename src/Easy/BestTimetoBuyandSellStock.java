package Easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
    int solution = 0;
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    for(int i = 0; i<prices.length; i++){
        hashMap.put(prices[i],i);
    }
    int buy = 0;
    int sell = 0;
    int profit = buy-sell;
    ArrayList<Integer> solutions = new ArrayList<>();
    for (int i = 0; i<prices.length; i++){

    }
    return solution;
    }
}
