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
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static Node deleteNode(Node root, int node){
        if(root.data<node){
            root.right=deleteNode(root.right, node);
        }else if(root.data>node){
            root.left=deleteNode(root.left, node);
        }else{
            //case 1 --> leaf node
            if(root.right==null && root.left == null){
                return null;
            }
            //case 2 --> single child
            else if(root.right==null){
                return root.right;
            }
            else if(root.left==null){
                return root.left;
            }
            
            //case 3 --> two child
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=deleteNode(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int val[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        printTree(root);
        // if(search(root, 10)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("Not found");
        // }
        //DELETE A NODE
        deleteNode(root, 5);
        System.out.println();
        printTree(root);
    }
}