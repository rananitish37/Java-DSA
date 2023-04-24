public class palindrome {
    public static void check(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("String is not palindrome");
                return;
            }
        }
        System.out.println("String is palindrome");
        return;
    }
    public static void main(String[] args) {
        String str="racecar";
        check(str);
    }
}
