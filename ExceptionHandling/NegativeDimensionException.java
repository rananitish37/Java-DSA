public class NegativeDimensionException extends Exception{

    public String toString(){
        return "Dimesion can't be negative";
    }

    public static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0) throw new NegativeDimensionException();
        return l*b;
    }
    public static void main(String[] args){
        try {
            System.out.println(area(10, -5));
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}

