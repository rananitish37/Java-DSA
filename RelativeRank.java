import java.util.Arrays;
import java.util.HashMap;

public class RelativeRank {
    public static void main(String[] args) {
        int []score = {5,4,3,2,1};
        
        String []ans = new String[score.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<score.length; i++){
            hm.put(score[i],i);
        }
        for(int i=0; i< score.length; i++){
            score[i] = score[i]*-1;
        }
        Arrays.sort(score);
        for(int i=0; i< score.length; i++){
            score[i] = score[i]*-1;
        }
        
        ans[hm.get(score[0])] = "Gold Medal";
        ans[hm.get(score[1])] = "Silver Medal";
        ans[hm.get(score[2])] = "Bronze Medal";
        for(int i=3; i<score.length; i++){
            ans[hm.get(score[i])]= ""+ (i+1); 
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
