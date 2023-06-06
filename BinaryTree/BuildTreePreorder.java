package BinaryTree;

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
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        BuildTree tree=new BuildTree();
        Node root=tree.buildTree(nodes);
        System.out.println(tree.height(root));
    }
}
