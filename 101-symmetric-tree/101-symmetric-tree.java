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
    public boolean isSymmetric(TreeNode root) {
        if(root!=null){
            return checkSymmetric(root.left,root.right);
        }else{
            return false;
        } 
    }
    
     public boolean checkSymmetric(TreeNode a, TreeNode b) {
        if(a==null && b==null){
            return true;
        }else if(a==null && b!=null){
            return false;
        }else if(a!=null && b==null){
            return false;
        }else if(a.val!=b.val){
            return false;
        }else{
            return checkSymmetric(a.left,b.right)&&checkSymmetric(a.right,b.left);
        }
     }
}