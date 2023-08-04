package backtracking;

public class KeypadCombination {
    public static String str[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void findCombination(int digits){
        if(digits==0){
            
            return;
        }
        int digit=digits%10;
        String ch=str[digit];
        for(int i=0;i<ch.length();i++){
            
        }

    }
    public static void main(String[] args) {
        findCombination(23);
    }
}
