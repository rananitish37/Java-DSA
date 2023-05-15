package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static class Stack{
        Deque<Integer> deq=new LinkedList<>();
        public void push (int data){
            deq.addFirst(data);
        }
        public int pop(){
            return deq.removeFirst();
        }
        public int peek(){
            return deq.peek();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
