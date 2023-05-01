package Stack;

import java.util.Stack;

public class RevStrUsgStack {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String str="nitish";
        int n=str.length();
        int i=0;
        while(i!=n){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder res=new StringBuilder("");
        while(!s.isEmpty()){
            res=res.append(s.pop());
        }
        System.out.println(res.toString());
    }
}
