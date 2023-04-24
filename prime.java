import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=2;
	while(i<num-1){
	    if(num%i==0){
	        System.out.println("Number is not prime");
		break;	
	    }i++;
	}if(i==num-1){
	     System.out.println("Number is a prime number");
	 }
    }
}