import java.util.Arrays;

public class stringAnagram {
    public static void main(String[] args) {
        String str1="race";
        String str2="caree";
        //to avoid checking seperatly for uppercase...
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //check firt that both strings are of same length
        if(str1.length() == str2.length()){
            //now convert the string to charater array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if both sorted arrays are same then strings are anagram
            boolean result=Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println("Strings are anagram");
            }else{
                System.out.println("strings are not anagram");
            }
        }else{
            System.out.println("strings are not anagram");
        }
    }
}
