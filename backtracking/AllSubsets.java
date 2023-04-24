package backtracking;

public class AllSubsets {
    public static void findSubsets(StringBuilder str,StringBuilder ans,int i){
        // base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        findSubsets(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt(i);

        //no
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abc");
        findSubsets(str,new StringBuilder(" "),0);
    }
}
