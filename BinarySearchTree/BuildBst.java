public class BuildBst{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
        
    }
    public static void printTree(Node root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return Search(root.left, key);
        }else{
            return Search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int val[]={1,2,5,7,3,9};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        printTree(root);
        if(Search(root, 3)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
        
        
    }
}