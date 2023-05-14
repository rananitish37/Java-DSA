package Queue;

import java.util.*;

public class InterleaveQueue {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int SIZE=q.size();
        for(int i=0;i<SIZE/2;i++){ //don't write direct q.size()/2 beacause size will always be changing
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);
    }
}
