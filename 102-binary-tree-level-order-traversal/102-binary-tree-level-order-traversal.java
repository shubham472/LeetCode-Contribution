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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root!=null){
            addChilds(result,root,0);
        }
        return result;
    }
    public void addChilds(List<List<Integer>> result, TreeNode root,int l){ 
            if(root==null){
                return;
            }
            if(l>=result.size()){
                ArrayList<Integer> t = new ArrayList<>();
                result.add(t);
            }
            result.get(l).add(root.val);
            addChilds(result, root.left, l+1);
            addChilds(result, root.right, l+1); 
    }
}