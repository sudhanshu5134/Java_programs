public class Stock_buy_sell_multi {
    int profit(int[]arr){
       
        int max_profit=0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max_profit +=(arr[i+1]- arr[i]);
            }
        }return max_profit;
    }
    public static void main(String[] args) {
        int[]arr = {7,2,6,3,9,6,0,3};
        Stock_buy_sell_multi sp= new Stock_buy_sell_multi();
        System.out.println(sp.profit(arr));
    }
}
