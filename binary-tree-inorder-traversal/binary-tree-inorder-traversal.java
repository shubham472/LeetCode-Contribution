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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> lefts = new Stack<>();
        TreeNode node = root;
        while(node!=null || !lefts.isEmpty()){
           while(node!=null){
               lefts.add(node);
               node = node.left;
           }
           node = lefts.pop();
           result.add(node.val);
           node = node.right;
        }
        return result;
    }
}