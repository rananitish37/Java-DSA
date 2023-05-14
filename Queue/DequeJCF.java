package Queue;

import java.util.*;

public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> deq=new LinkedList<>();
        deq.addFirst(2);
        deq.addFirst(1);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq);
        System.out.println(deq.getFirst());
        System.out.println(deq.getLast());
        deq.removeFirst();
        deq.removeLast();
        System.out.println(deq);
    }
}
