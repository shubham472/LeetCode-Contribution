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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> rights = new Stack<>();
        TreeNode node = root;
        while(node!=null){
            result.add(node.val);
            if(node.right!=null){
                rights.push(node.right);
            }
            node=node.left;
            if(node==null && !rights.isEmpty()){
                node = rights.pop();
            }
        }
        return result;
    }
}