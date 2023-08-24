package BinaryTree;

import org.w3c.dom.Node;

public class BuildTreePreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BuildTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }
        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int lCount=countNodes(root.left);
            int rCount=countNodes(root.right);
            return lCount+rCount+1;
        }
        public static int totalSum(Node root){
            if(root==null){
                return 0;
            }
            int lSum=totalSum(root.left);
            int rSum=totalSum(root.right);
            return lSum+rSum+root.data;
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftDiam=diameter(root.left);
            int leftHt=height(root.left);
            int rightDiam=diameter(root.right);
            int rightHt=height(root.right);

            int selfDiam=leftHt+rightHt+1;
            return Math.max(selfDiam,Math.max(leftDiam, rightDiam));            
        }
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
         */
        BuildTree tree=new BuildTree();
        Node root=tree.buildTree(nodes);
        System.out.println("height of tree: "+tree.height(root));
        System.out.println("total nodes in tree: "+tree.countNodes(root));
        System.out.println("Sum of nodes: "+tree.totalSum(root));
        System.out.println("Diameter: "+tree.diameter(root));
    }
}
