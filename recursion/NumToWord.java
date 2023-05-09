package recursion;

public class NumToWord {
    static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        numToWord(2019);
    }
    public static void numToWord(int Num){
        if(Num==0){
            return;
        }
        int lastDigit=Num%10;
        numToWord(Num/10);
        System.out.print(str[lastDigit]+" ");
    }
    
}
