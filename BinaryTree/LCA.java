package BinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode leftLCA=lowestCommonAncestor(root.left,p,q);
        TreeNode rightLCA=lowestCommonAncestor(root.right,p,q);
        
        if(leftLCA==null){
            return rightLCA;
        }
        if(rightLCA==null){
            return leftLCA;
        }
        return root;
    }
}
