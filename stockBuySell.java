public class stockBuySell {
    public static void maxProfit(int []num){
        int maxPro=0;
        int buyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int profit=0;
            if(buyingPrice<num[i]){
                profit=num[i]-buyingPrice;
                maxPro=Math.max(maxPro, profit);
            }else{
                buyingPrice=num[i];
            }
        }
        System.out.println(maxPro);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        maxProfit(arr);
    }
}
