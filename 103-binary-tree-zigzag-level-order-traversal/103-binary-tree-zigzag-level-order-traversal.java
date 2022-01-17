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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null){
            levelOrder(root,result,0);
        }
        return result;
    }
    public void levelOrder(TreeNode root,List<List<Integer>> result,int l){
        if(root==null){
            return;
        }
        if(l>=result.size()){
            List<Integer> temp = new ArrayList<>();
            result.add(temp);
        }
        if(l%2!=0){
            result.get(l).add(root.val);
        }else{
            result.get(l).add(0,root.val);
        }        
        levelOrder(root.right,result,l+1);
        levelOrder(root.left,result,l+1);
        
    }
}