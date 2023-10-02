import java.util.*;

public class generateParanthesis {
    public static void main(String[] args) {
        List<String> res=new ArrayList<>();
        Solution obj=new Solution();
        res=obj.generateParenthesis(3);
        System.out.println(res);
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, 0,"", res, n);
        return res;
    }
    
    public void backtrack(int openN, int closeN,String s, List<String> res, int n) {
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if (openN < n) {
            backtrack(openN + 1, closeN,s+"(", res, n);
        }
    
        if (closeN < openN) {
            backtrack(openN, closeN+1,s+")", res, n);
        }
    }
    
    }
