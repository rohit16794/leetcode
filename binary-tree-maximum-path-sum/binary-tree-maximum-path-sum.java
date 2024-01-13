public class Solution {
	private int result;
	public int maxPathSum(TreeNode root) {
		result = Integer.MIN_VALUE;
		maxPathSumUtil(root);
		return result;
} // main func end

private int maxPathSumUtil(TreeNode root) {
	if(root==null) return 0;
	
	int leftGain = Math.max(maxPathSumUtil(root.left),0);
	int rightGain = Math.max(maxPathSumUtil(root.right),0);
	
	result = Math.max(result, leftGain+rightGain+root.val);
	
	return root.val+Math.max(leftGain, rightGain);
} //priv func end

} // class end

