//reverse of number 
import java.util.Scanner;
/*class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	while(num!=0){
	    int last_digit=num%10;
	    System.out.print(last_digit);
	    num=num/10;
	}
    }
}*/
class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int reversenum=0;
	while(num!=0){
	    int last_digit=num%10;
	    reversenum=(reversenum*10)+last_digit;
	    num=num/10;
	}
	System.out.println("Reverse of number="+reversenum);
    }
}