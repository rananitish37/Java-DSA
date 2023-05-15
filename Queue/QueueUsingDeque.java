package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    public static class Queue{
        Deque<Integer> deq=new LinkedList<>();
        public void add(int data){
            deq.addFirst(data);
        }
        public int remove(){
            return deq.removeLast();
        }
        public int peek(){
            return deq.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
