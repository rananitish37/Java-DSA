package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelectionNotSorted {
    int start[]={0,1,3,5,5,8};
    int end[]={6,2,4,7,9,9};

    int Activities[][]=new int[start.length][3];

    for(int i=0;i<start.length;i++){
        Activities[i][0]=i;
        Activities[i][1]=start[i];
        Activities[i][2]=end[i];
    }
    Arrays.sort(Activities,Comparator.comparingDouble(o -> o[2]));

    int maxAct=0;
    ArrayList<Integer> ans=new ArrayList<>();

    maxAct=1;
    ans.add(Activities[0][0]);
    int lastEnd=Activities[0][2];
    for(int i=1;i<start.length;i++){
        if(Activities[i][1] >= lastEnd){
            maxAct++;
            ans.add(Activities[i][0]);
            lastEnd=Activities[i][2];
        }
    }
    
}
