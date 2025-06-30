package Arrays;
import java.util.Arrays;
import java.util.Collections;
public class BuyandSell {
    public static int buyandsells(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit += prices[i] - buyPrice;
                //maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        Integer prices1[] = { 7, 1, 5, 3, 6, 4 };
        Arrays.sort(prices, 0, 4);
        Arrays.sort(prices1,1,3, Collections.reverseOrder());
        for (int i = 0; i < prices.length; i++) {
            //System.out.print(prices[i] + " ");
           
            System.out.print(prices1[i]+" ");
        }

        System.out.println(buyandsells(prices));

    }
}
