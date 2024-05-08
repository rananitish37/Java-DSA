

import java.io.*;
import java.util.*;
import java.math.*;


class GFG
{
    public static void main(String args[]) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine().trim());
            Solution T = new Solution();
            System.out.println(T.minDiff(root,k));
     }
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    
}
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

// } Driver Code Ends


//User function Template for Java

/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/

class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static void findDiff(Node root, int K,int diff){
        if(root == null){
            return;
        }
        if(root.data > K){
            findDiff(root.left, K, diff);
            diff = Math.min(Math.abs(root.data - K), diff);
        }else if(root.data < K){
            findDiff(root.right,K, diff);
            diff = Math.min(Math.abs(root.data - K), diff);
        }else{
            diff = 0;
        }
    }
    static int diff=0;
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
      
        findDiff(root, K,diff);
        return diff;
    } 
}

