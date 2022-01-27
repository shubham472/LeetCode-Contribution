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
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode r = build(0,0,inorder.length-1,preorder,inorder);
        return r;
    }
    
    public TreeNode build(int prein,int instrt,int ined,int[] preorder, int[] inorder) {
        if(prein>preorder.length-1 || instrt>ined){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prein]);
        int index = map.get(preorder[prein]);
        root.left = build(prein+1,instrt,index-1,preorder,inorder);
        root.right = build(prein+index-instrt+1,index+1,ined,preorder,inorder);
        return root;
    }
}