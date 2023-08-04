public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            lowest = Math.min(lowest, prices[i]);
            profit = Math.max(profit, lowest - prices[i]);
        }

        return profit;
    }
}
