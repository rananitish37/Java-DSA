    import java.util.*;
    import java.io.*;
    
    
    class LinkedListPairSwap{
        static void printList(Node node) 
        { 
            while (node != null) 
            { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
            System.out.println(); 
        }
        
        public static void main(String args[]) throws IOException { 
            Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
                mp.put(head, head.data); 
                for(int i=0; i<n-1; i++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                    mp.put(tail, tail.data); 
                }
                
                Node failure = new Node(-1);
                
                Solution g = new Solution();
                head = g.pairwiseSwap(head);
                
                Node temp = head;
                int f = 0;
                while (temp != null) 
                { 
                    if(mp.get(temp) != temp.data){
                        f = 1;
                    }
                    temp = temp.next; 
                } 
                
                if(f==1){
                    printList(failure); 
                }
                else{
                    printList(head); 
                }
        } 
    } 
    class Node{
        int data;
        Node next;
        
        Node(int x){
            data = x;
            next = null;
        }
        
    }
    
    
    class Solution {
        // Function to pairwise swap elements of a linked list.
        // It should returns head of the modified list
        public Node pairwiseSwap(Node head)
        {
            // code here
            Node temp = new Node(0);
            temp.next = head;
            Node prev = temp;
            Node curr = head;
     
            while (curr != null && curr.next != null) {
                Node nextNode = curr.next;
                Node nodeNextToNextNode = curr.next.next;
                nextNode.next = curr;
                curr.next = nodeNextToNextNode;
                prev.next = nextNode;
                prev = curr;
                curr = nodeNextToNextNode;
            }
     
            return temp.next;
        }
    }