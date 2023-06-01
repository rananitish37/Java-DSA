package Greedy;

import java.util.ArrayList;
import java.util.Arrays;


public class IndianCoinChange {
    public static void main(String[] args) {
        int amount=59042;
        int []coins={1,2,5,10,20,50,100,500,2000};
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(coins);  
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }System.out.println();
        if(count>0 && amount==0){
            System.out.println(count);
        }else{
            System.out.println("-1");
        }
    }
}
