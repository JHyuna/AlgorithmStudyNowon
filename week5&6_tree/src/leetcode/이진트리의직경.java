package leetcode;

// 거리 = 왼쪽자식의 리프노드에서 현재 노드까지의 거리 + 오른쪽 자식의 리프노드에서 현재노드 까지의 거리 + 2
// 각각의 상태값과 거리값이 존재
// 재귀를 통해 맨 아래 노드까지 가서 상태값 부여하며 한 레벨씩 상태값 부여, 거리값 계산
public class 이진트리의직경 {
	int longest =0;
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
	
	public int diameterOfBinaryTree(TreeNode root) {
		dfs(root);
		return longest;
	}
	
	private int dfs(TreeNode node) {
		if(node == null)
			return -1;
		
		int left = dfs(node.left);
		int right = dfs(node.right);
		
		//거리
		longest = Math.max(longest, left+right+2);
		//상태값을 리턴
		return Math.max(left,right)+1;
	}
	
	public static void main(String[] args) {
		TreeNode rightN1 = new TreeNode(5,null,null);  
		TreeNode leftN1 = new TreeNode(4,null,null);
		TreeNode leftN = new TreeNode(2,leftN1,rightN1);
		TreeNode rightN = new TreeNode(3,null,null);  
		TreeNode root = new TreeNode(1,leftN,rightN);
		
		이진트리의직경 no = new 이진트리의직경();
		System.out.println(no.diameterOfBinaryTree(root));
	}
}
