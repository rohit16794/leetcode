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
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root==null) return result;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int currentLevel = 0, currentLevelSize;
        while(!queue.isEmpty()) {
            result.add(new ArrayList<Integer>());
            
            currentLevelSize = queue.size();
            
            for(int i = 0; i<currentLevelSize; i++) {
                TreeNode node = queue.remove();
                
                result.get(currentLevel).add(node.val);
                
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            ++currentLevel;
        }
        return result;
    }
}