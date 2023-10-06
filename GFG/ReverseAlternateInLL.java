    import java.util.*;
    import java.lang.*;
    
    
    
    class ReverseAlternateInLL
    {
        static Node head;
        
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            
                int n = sc.nextInt();
                int a1 = sc.nextInt();
                Node head = new Node(a1);
                Node temp = head;
                for(int i = 1; i < n; i++)
                {
                    int a = sc.nextInt();
                    temp.next = new Node(a);
                    temp = temp.next;
                }
                
                Solution ob = new Solution();
                ob.rearrange(head);
                printLast(head);
                System.out.println();
        }
        
        public static void printLast(Node node)
        {
            while(node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }
    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    class Solution
    {
        public static Node reverse(Node head) {
            if(head==null || head.next==null){
                return head;
            }
    
            Node prev=null;
            Node curr=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public static void rearrange(Node odd)
        {
            // add your code here
            Node first = odd;
            Node second = odd.next;
            Node temp = odd.next;
            while (first.next != null && second.next != null) {
                first.next = first.next.next;
                first = first.next;
                second.next = second.next.next;
                second = second.next;
            }
     
            first.next = reverse(temp);
        }
    }
    
