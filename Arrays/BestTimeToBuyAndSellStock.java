public class BestTimeToBuyAndSellStock{
    // Function to calculate maximum profit
    public static int buy_sell_stock(int price[]){
        int n = price.length;
        int maxprofit =0;
        // initialize buy price to a very high value
        int buyprice = Integer.MAX_VALUE;

        // Loop through each day's price 
        for(int i=0;i<n;i++){
         // If current price is higher than the minimum buy price seen so far
            if(buyprice < price[i]){
                // calculate profit if sold today 
               int profit = price[i]-buyprice;
                // update maximum profit if this profit is higher 
               maxprofit = Math.max(profit,maxprofit);
            }else{
                // update buy price if current price is lower 
                buyprice = price[i];
            }
        }
        // Return the maximum profit found
        return maxprofit;
    } 
    public static void main (String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(buy_sell_stock(price));
    }
}
