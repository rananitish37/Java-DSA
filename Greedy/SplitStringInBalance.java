public class SplitStringInBalance {
    public static int balancedStringSplit(String s) {
        int count=0;
        int total=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                count++;
            }
            if(s.charAt(i)=='L'){
                count--;
            }
            if(count==0){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        String str="RLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
    }
}
