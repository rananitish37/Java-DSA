import java.util.HashSet;

public class arrayContainsDuplicate {
    public static boolean checkDuplicate(int[] num){
        // HashSet<Integer>set =new HashSet<>();
        // for(int i=0;i<num.length;i++){
        //     if(set.contains(num[i])){
        //         return true;
        //     }else{
        //         set.add(num[i]);
        //     }
        // }
        // return false;
        
        
        
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        System.out.println(checkDuplicate(arr)); 
    }
}
