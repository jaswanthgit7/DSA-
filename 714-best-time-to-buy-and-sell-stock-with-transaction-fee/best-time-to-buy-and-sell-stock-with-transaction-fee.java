class Solution {
    public int maxProfit(int[] prices, int fee) {
        int max= 0;
        int price = prices.length;
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < price; i++) {
            if (prices[i] < min) {
                min= prices[i];
            } 
            else if (prices[i] - min > fee) {
                max += prices[i] - min - fee;
                min= prices[i] - fee;
            }
        }
        return max;
    }
}