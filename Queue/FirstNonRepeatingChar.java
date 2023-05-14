//GFG question
// class Solution
// {
//     //Function to find the first non-repeating character in a string.
//     static char nonrepeatingCharacter(String S)
//     {
//         //Your code here
//         Queue<Character> q=new LinkedList<>();
//         int freq[]=new int[26];
//         for(int i=0;i<S.length();i++){
//             char ch=S.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;
//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
//             }
//         }
//         if(q.isEmpty()){
//             return '$';
//         }else{
//             return q.peek();
//         }
//     }
// }



package Queue;
import java.util.*;

/**
 * FirstNonRepeatingChar
 */
public class FirstNonRepeatingChar {
    public static void printNonRepeating(String str){
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String s="aabccxb";
        printNonRepeating(s);
    }
}