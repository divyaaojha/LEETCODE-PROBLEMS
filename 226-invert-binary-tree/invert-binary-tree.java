/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //swapping right anf left subtree rooted at node
    public TreeNode invert(TreeNode node){
        if(node == null)return null; // null is the root, so return root, which is equal to null


        //swapped left and right node 
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
        return node;

    }
    public TreeNode invertTree(TreeNode root) {
       return invert(root); 
    }
}