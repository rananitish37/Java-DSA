package Stack;

import java.util.*;
public class StockSpan {
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int [] span=new int[n];
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        
        for(int i=1;i<n;i++){
            int currPrice=price[i];
            while(!s.isEmpty() && currPrice >= price[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
        return span;
        
    }
    public static void main(String[] args) {
        int[] price={100,80,60,70,60,85,100};
        int res[]=calculateSpan(price, price.length);
        for(int i=0;i<price.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
