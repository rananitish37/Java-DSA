package Stack;

import java.util.*;

public class DuplicateParanthesis {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                int count=0;
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return 1;
                }else{
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str="(((a+b)+(c+d)))";
        System.out.println(checkRedundancy(str));
    }
}
