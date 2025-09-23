public class Stock_buy_and_sell_single {
    int profit(int []arr){
        int buy_price = arr[0];
        int current_profit = 0;
        int max_profit=0;

        for(int i=1;i<arr.length;i++){
             if(arr[i]<buy_price){
                buy_price = arr[i];
             }
             else{
                current_profit = arr[i] - buy_price;
             }
             if (max_profit<current_profit){
                max_profit = current_profit;
             }
            
        }
         return max_profit;
        
    }
    public static void main(String[] args) {
        int []arr = {7,4,2,6,3,9,4,6,0,2,5,4,2,1,7,4};
        Stock_buy_and_sell_single sp = new Stock_buy_and_sell_single();
        System.out.println(sp.profit(arr));
    }
    
}
