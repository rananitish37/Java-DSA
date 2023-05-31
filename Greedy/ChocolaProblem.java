package Greedy;

import java.util.Collections;
import java.util.Arrays;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer X[]={2,1,3,1,4};
        Integer Y[]={4,1,2};
        Arrays.sort(X,Collections.reverseOrder());
        Arrays.sort(Y,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<Y.length && v<X.length){
            if(X[v]<=Y[h]){
                cost+=Y[h]*vp;
                h++;
                hp++;
            }else{
                cost+=X[v]*hp;
                v++;
                vp++;
            }
        }
        while(h<Y.length){
            cost+=Y[h]*vp;
            h++;
            hp++;
        }
        while(v<X.length){
            cost+=X[v]*hp;
            v++;
            vp++;
        }
        System.out.println(cost);
    }
}
