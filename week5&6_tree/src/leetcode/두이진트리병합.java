package leetcode;

import leetcode.이진트리반전.TreeNode;

// 두 이진트리를 병합할 때 두 노드가 겹치는 경우 두 노드를 더해서 새 노드값으로 사용.
public class 두이진트리병합 {
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
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null)
			return null;
		if(t2 == null)
			return null;
		
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		
		return t1;
	}

}