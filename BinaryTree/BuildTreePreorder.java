package BinaryTree;

import java.util.*;

import javax.sound.midi.Soundbank;

import org.w3c.dom.Node;

import BinaryTree.BuildTreePreorder.BuildTree;

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
    static class Info{
        Node node;
        int hd;
        public Info(Node nod, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                 if(!map.containsKey(curr.hd)){
            map.put(curr.hd,curr.node);
        }
        if(curr.node.left!=null){
            q.add(new Info(curr.node.left,curr.hd-1));
            min=Math.min(min,curr.hd-1);
        }
        if(curr.node.right!=null){
            q.add(new Info(curr.node.right,curr.hd-1));
            max=Math.max(max,curr.hd+1);
        }
            }
        }
       
        for(int i=min;i<=max;i++){
            res.add(map.get(i).data);
        }
        return res;
    }
    public static void kthLevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean leftVal=getPath(root.left, n, path);
        boolean rightVal=getPath(root.right, n, path);
        
        if(leftVal || rightVal){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node LowestCommonAncestor(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //last common ancestor
        int i=0;
        for(;1<path1.size() && 1<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last qual node
        return path1.get(i-1);
    }
    public static int distLCA(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=distLCA(root.left, n);
        int rightDist=distLCA(root.right, n);
        if(leftDist==-1 && rightDist ==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=LowestCommonAncestor(root, n1, n2);
        int dist1=distLCA(root, n1);
        int dist2=distLCA(root, n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
         */
        BuildTree tree=new BuildTree();
        Node root=tree.buildTree(nodes);
        // System.out.println("height of tree: "+tree.height(root));
        // System.out.println("total nodes in tree: "+tree.countNodes(root));
        // System.out.println("Sum of nodes: "+tree.totalSum(root));
        // System.out.println("Diameter: "+tree.diameter(root));
        // System.out.println("Diameter: "+topView(root));
        // kthLevel(root, 1, 3);
        // System.out.println(LowestCommonAncestor(root,4,5).data);
        System.out.println(minDist(root, 4, 5));
    }
}
