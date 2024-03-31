import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i=0,a=2,k=2;
        int []arr = new int[4];
        try{
            // i = k/i;
            //checked exception
            a=Integer.parseInt(br.readLine());
            a=a+2;
            System.out.println(a);
            for(int j=0;j<=4;j++){
                arr[j] = j+1;
            }
            for(int j=0;j<=4;j++){
                System.out.println(arr[j]);
            }
            
        }
        
        catch(IOException ie){
            System.out.println("IO Exception");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
        catch(Exception ie){
            System.out.println("A number can't be devide by zero");
        }
        finally{
            System.out.println("It will always get printed");
        }
    }
}