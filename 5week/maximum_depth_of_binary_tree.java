package week4;

public class maximum_depth_of_binary_tree {

	public static void main(String[] args) {

	}

	static int answer = 0;

	public static int maxDepth(TreeNode root) {
		answer = 0;
		try {
			root.val = 1;
		} catch (Exception e) {
			return answer;
		}
		dfs(root, 0);
		return answer;
	}

	public static void dfs(TreeNode tree, int val) {
		tree.val = val + 1;
		if (answer < tree.val) {
			answer = tree.val;
		}
		if (tree.left != null) {
			dfs(tree.left, tree.val);
		}
		if (tree.right != null) {
			dfs(tree.right, tree.val);
		}
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
