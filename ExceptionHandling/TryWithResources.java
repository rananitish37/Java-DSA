import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws Exception {

        // BufferedReader br;
        // try{
        //     String n = "";
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     n=br.readLine();
        // }catch(Exception e){
        //     System.out.println(e);
        // }finally{
        //     br.close();
        // }
        
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String n = "";
            n=br.readLine();
        }
    }
}
