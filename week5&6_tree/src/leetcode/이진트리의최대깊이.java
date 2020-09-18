package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/


public class 이진트리의최대깊이 {
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
	
	//1.BFS
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		int depth = 0;
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.offer(root);
		while(!nodes.isEmpty()) {
			int size = nodes.size();
			depth++;
			while(size-- > 0) {
				TreeNode node = nodes.poll();
				if(node.left != null) nodes.offer(node.left);
				if(node.right != null) nodes.offer(node.right);
			}
		}
		return depth;
	}
	
	public static void main(String[] args) {
		TreeNode leftN = new TreeNode(9,null,null);
		TreeNode leftN1 = new TreeNode(15,null,null);  
		TreeNode rightN2 = new TreeNode(7,null,null);  
		TreeNode rightN = new TreeNode(20,leftN1,rightN2);  
		TreeNode root = new TreeNode(3,leftN,rightN);
		
		이진트리의최대깊이 no = new 이진트리의최대깊이();
		System.out.println(no.maxDepth(root));
	}
}

