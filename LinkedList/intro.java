package LinkedList;

public class intro {
    class Node{
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
    public static void main(String[] args) {
        intro ll=new intro();
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        ll.addFirst(1);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        ll.addLast(5);
        ll.printList();
        ll.addMidle(2, 3);
        ll.printList();
        // System.out.println("size: "+size);
        // int val=ll.removeFirst();
        // System.out.println(val+" is deleted from list");
        // ll.removeFirst();
        // ll.printList();
        // ll.removeLast();
        // ll.printList();
        // ll.eleSearch(4);
        System.out.println(ll.recSearch(4));
    }
}
