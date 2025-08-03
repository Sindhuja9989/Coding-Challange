
class Solution {

    public static int maxProfit(int[] prices) {
        int min = 10000, index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                index = i;
            }
        }
        int max = 0, ii = 0;
        for (i = index; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                ii = i;
            }
        }
        return i - 1;
    }
}
