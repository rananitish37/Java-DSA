class prime{
    public static void main(String args[]){
	int n=97;
     	isPrime(n);
    }
    public static void isPrime(int n){
   	int i=2;
	if(n==2){
	    System.out.println("Number is prime");
	}
	while(i<Math.sqrt(n)){
   	    if(n%i==0){
		System.out.println("number is not prime");
		return;
	    }i++;
   	}
	    
	System.out.println("number is prime");
    }
}