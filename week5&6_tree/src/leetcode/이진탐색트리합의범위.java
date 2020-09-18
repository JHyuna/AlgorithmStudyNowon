package leetcode;

public class 이진탐색트리합의범위 {
	int sum = 0;
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
	//L이상 R이하
	public int rangeSumBST(TreeNode root, int L, int R) {
        helper(root,L,R);
        return sum;
    }
	
	//r보다 root 큰 경우 -> 왼쪽,l보다 root 작은 경우->오른쪽,
	private void helper(TreeNode root, int l, int r) {
		if(root == null)
			return;
		
		if(r <= root.val) {
            if(r == root.val)
                sum+=root.val;
			helper(root.left,l,r);
		}else if(l >= root.val) {
            if(l == root.val)
                sum+=root.val;
			helper(root.right,l,r);
		}else {
			sum += root.val;
			helper(root.left,l,r);
			helper(root.right,l,r);
		}
	}
}
		
