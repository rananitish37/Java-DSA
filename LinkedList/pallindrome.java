package LinkedList;

public class pallindrome {
    static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    static Node tail;
    static Node head;
    static void addFirst(char data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node mid=slow;
        //reverse the list
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node rightH=prev;
        Node leftH=head;
        while(rightH != null){
            if(leftH.data!=rightH.data){
                return false;
            }
            leftH=leftH.next;
            rightH=rightH.next;
        }
        return true;
    }
    public static void main(String[] args) {
        addFirst('A');
        addFirst('B');
        addFirst('C');
        addFirst('B');
        addFirst('A');
        printList();
        System.out.println();
        System.out.println(checkPalindrome());
    }
}
