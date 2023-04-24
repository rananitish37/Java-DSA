import java.util.Scanner;

public class noOfVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char check=str.charAt(i);
            if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
