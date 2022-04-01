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
        List<Integer> result = new ArrayList<Integer>();
        storeInOrderTraversal(root, result);
        return result;
    }
    
    private void storeInOrderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) return;
        storeInOrderTraversal(root.left, result);
        result.add(new Integer(root.val));
        storeInOrderTraversal(root.right, result);
    }
}