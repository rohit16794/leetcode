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
        List<Integer> result = new ArrayList<Integer>();
        storePreOrderTraversal(root, result);
        return result;
    }
    
    private void storePreOrderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) return;
        result.add(new Integer(root.val));
        storePreOrderTraversal(root.left, result);
        storePreOrderTraversal(root.right, result);
    }
}