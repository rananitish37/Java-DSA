class BioCoff{
    public static int fact(int n){
	int fact=1;
    	for(int i=1;i<=n;i++){
	    fact= fact*i;
    	}
	return fact;
    }
    public static int coff(int n,int r){
	int rfact=fact(r);
	int nfact=fact(n);
	int nmrfact=fact(n-r);
	return (nfact/(nmrfact*rfact));
    }
    public static void main(String args[]){
        System.out.println(coff(5,2));
    }
}