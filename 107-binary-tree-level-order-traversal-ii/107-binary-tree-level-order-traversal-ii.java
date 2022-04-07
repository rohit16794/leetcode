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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int level = 0, currentLevelSize;
        
        if(root == null) return result;
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            currentLevelSize = queue.size();
            result.add(new ArrayList<Integer>());
            
            for(int i = 0; i < currentLevelSize; i++) {
                TreeNode currentNode = queue.peek();
                queue.remove();
                result.get(level).add(currentNode.val);
                
                if(currentNode.left!=null) queue.add(currentNode.left);
                if(currentNode.right!=null) queue.add(currentNode.right);
            }
            ++level;
        }
        Collections.reverse(result);
        return result;
    }
}