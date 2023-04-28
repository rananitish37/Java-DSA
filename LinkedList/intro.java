package LinkedList;

public class intro {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //ADD AT STARTING
    public void addFirst(int data){
        //create node first
        Node newNode=new Node(data);
        size++;
        //if Linked List is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode.next=>head
        newNode.next=head;
        //head=>newNode
        head=newNode;
    }
    //ADD AT THE END
    public void addLast(int data){
        //create new node first
        Node newNode=new Node(data);
        size++;
        //if list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail.next=>newNode
        tail.next=newNode;
        //tail.next=>newNode
        tail=newNode;

    }
    //ADD IN BETWEEN(IN MIDLE)
    public void addMidle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        int temp=0;
        Node tmp=head;
        Node newNode=new Node(data);
        size++;
        while(temp<idx-1){
            temp++;
            tmp=tmp.next;
        }
        newNode.next=tmp.next;
        tmp.next=newNode;
    }
    //PRINT ALL ELEMENTS IN LIST
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //Remove from first
    public int removeFirst(){
        if(size==0){
            System.out.println("list is empty");
            return 0;
        }else if(size==1){
            size=0;
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //Remove from last
    public int removeLast(){
        if(size==0){
            System.out.println("list is empty");
            return 0;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //Iterative Search
    public void eleSearch(int x){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==x){
                System.out.println("elememt found at index: "+i);
            }
            temp=temp.next;
        }
    }
    //Recursive search
    public int helper(Node temp,int key){
        if(temp==null){
            return -1;
        }else if(temp.data==key){
            return 0;
        }
        int idx=helper(temp.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    //remove nth node from end
    public Node removeNthFromEnd(Node head, int n) {
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return head;
        }
        Node prev=head;
        int i=1;
        int iToFind=sz-n;
        while(i < iToFind){
            prev=prev.next;
            i++;
        }
         
        prev.next = prev.next.next;
        return head;
    }
    //check palindrome
    //find mid first
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;//+2
            slow=slow.next;//+1
        }
        return slow;
    }
    //checking palindrome
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=findMid(head);

        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    //Detect a loop/cycle in Linked List(cycle Finding algorithm Floyd's algorithm)
    public boolean detectCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        intro ll=new intro();
        head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=head;
        // ll.printList();
        System.out.println(ll.detectCycle(head));
    }
    // public static void main(String[] args) {
        // intro ll=new intro();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addMidle(2, 3);
        // ll.printList();
        // System.out.println("size: "+size);
        // int val=ll.removeFirst();
        // System.out.println(val+" is deleted from list");
        // ll.removeFirst();
        // ll.printList();
        // ll.removeLast();
        // ll.printList();
        // ll.eleSearch(4);
        // System.out.println(ll.recSearch(4));

        // System.out.println(ll.checkPalindrome());

       
    // }
    
}
