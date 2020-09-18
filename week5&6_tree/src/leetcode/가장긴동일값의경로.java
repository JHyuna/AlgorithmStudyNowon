package leetcode;

import java.util.LinkedList;
import java.util.Queue;

// 어렵다ㅠ
public class 가장긴동일값의경로 {
	static int result = 0;
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
	public int longestUnivaluePath(TreeNode root) {
		dfs(root);
		return result;
    }
	
	private int dfs(TreeNode root) {
		if(root == null)
			return 0;
		
		//존재하지 않는 노드까지 DFS 재귀탐색 - 백트래킹
		int l= dfs(root.left);
		int r = dfs(root.right);
		
		
		if(root.left!=null && root.left.val == root.val) {
			l+=1;
		}else
			l=0;
		
		if(root.right!=null && root.right.val == root.val)
			r+=1;
		else
			r = 0;
		
		//result는 백트레킹 하면서 큰수로 계속 체인지
		result = Math.max(result,l+r);
		//현재 노드는 양쪽 자식 노드를 모두 연결할 수 있지만 현재 노드의 부모 노드에서는 지금의 양쪽 자식 노드를 동시에 연결할 수 없다.
		//단방향이므로 양쪽 자식 노드중 어느 한쪽 자식만 택할 수 있으며 이는 트리의 특징
		return Math.max(l,r);
	}

	public static void main(String args[]) {
		TreeNode leftN1 = new TreeNode(1,null,null);
		TreeNode rightN1 = new TreeNode(1,null,null);
		TreeNode leftN = new TreeNode(4,leftN1,rightN1);
		TreeNode rightN2 = new TreeNode(5,null,null); 
		TreeNode rightN = new TreeNode(5,null,rightN2);  
		TreeNode root = new TreeNode(5,leftN,rightN);
		
		가장긴동일값의경로 dong = new 가장긴동일값의경로();
		System.out.println(dong.longestUnivaluePath(root));
	}
}
