package Stack;

import java.util.ArrayList;

public class stackUsingAL {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() ==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
