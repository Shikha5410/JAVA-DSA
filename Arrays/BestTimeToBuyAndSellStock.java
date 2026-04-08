public class BestTimeToBuyAndSellStock{
    public static int buy_sell_stock(int price[]){
        int n = price.length;
        int maxprofit =0;
        int buyprice = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(buyprice < price[i]){
               int profit = price[i]-buyprice;
               maxprofit = Math.max(profit,maxprofit);
            }else{
                buyprice = price[i];
            }
        }
        return maxprofit;
    } 
    public static void main (String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(buy_sell_stock(price));
    }
}