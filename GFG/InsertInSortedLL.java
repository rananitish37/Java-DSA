import java.util.*;
import java.io.*;

class InsertInSortedLL{
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
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
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
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        if (key < head1.data) {
            newNode.next = head1;
            head1 = newNode;
            return head1;
        }
        Node temp=new Node(10);
        temp.next=head1;
        while(temp.next!=null && temp.next.data<=key){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=newNode;
            return head1;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head1;
    }
}
