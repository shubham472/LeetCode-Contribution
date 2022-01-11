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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        TreeNode r=nodeArray(nums,0,nums.length-1);
        return r;
      
    }
    
    public TreeNode nodeArray(int[] nums,int s,int e){
        if(s>e){
            return null;
        }
        int m = (s+e)/2;
         TreeNode r = new TreeNode(nums[m]);
         r.left = nodeArray(nums,s,m-1);
         r.right = nodeArray(nums,m+1,e);
         return r;
    }
}