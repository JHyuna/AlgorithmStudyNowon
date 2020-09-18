package leetcode;

//두 노드 간 값의 차이가 가장 작은 노드의 값의 차이 구하라
//BST의 왼쪽 자식은 항상 루트보다 작고, 오른쪽 자식은 크다. -> 재귀 구조로 중위순회(root의 위치변화)
//헷갈림!!
public class 이진탐색트리노드간최소거리 {
	int result = Integer.MAX_VALUE;
	Integer prev = null;
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
	public int minDiffInBST(TreeNode root) {
		if(root.left != null)
			minDiffInBST(root.left);
		
		if(prev != null)
			result = Math.min(result, root.val-prev);
		prev = root.val;
		
		if(root.right != null)
			minDiffInBST(root.right);
		
		return result;
    }
	
}
