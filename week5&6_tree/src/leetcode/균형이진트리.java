package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 균형이진트리 {
	static int level = 0;
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
		    this.left = left;
		    this.right = right;
		}
	}
	 
	   public boolean isBalanced(TreeNode root) {
	        return dfs(root) != -1;
	    }
		
		private int dfs(TreeNode root) {
			if(root == null)
				return 0;
			
			int l = dfs(root.left);
			int r = dfs(root.right);
			
			if(l == -1 || r==-1 || Math.abs(l-r) > 1) {
				return -1;
			}
			
			return Math.max(l, r)+1;
		}
	
	
	public static void main(String[] args) {
		//TreeNode left = new TreeNode(2,null,null);
		//TreeNode root = new TreeNode(1,left,null);
		균형이진트리 iz = new 균형이진트리();
		System.out.println(iz.isBalanced(null));
	}
}
