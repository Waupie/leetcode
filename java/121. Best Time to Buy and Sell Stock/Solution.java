/**
 * Author:      Maximilian Holm
 * Date:        01/04/2025
 * Description: Finding the max value when buying a stock. If a value 
 *              is low when buying and then having a high value later
 *              will the profil be the highest. If one goes with a loss
 *              the solution will return a 0 and therefor is there no good
 *              time to buy the stock.
 */


class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            int profit = price - minPrice;
            if (profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
}