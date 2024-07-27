package Day2;

/**
 * buySellStocks
 */
public class buySellStocks {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
  
        int profit = 0;
  
        for(int i : prices){
          if(i < buy){
              buy = i;
          }
          if(i - buy > profit){
              profit = i - buy;
          }
        } 
  
        return profit;
      }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit  = maxProfit(prices);
        System.out.println(profit);
    }
}