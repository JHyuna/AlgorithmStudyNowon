package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class 이진트리반전 {
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
	
	//재귀 이용 - 가장 말단 리프 노드까지 내려가서 백트래킹 하면서 스왑
	public TreeNode ReinvertTree(TreeNode root) {
	    if (root == null) {
	        return null;
	    }
	    TreeNode right = ReinvertTree(root.right);
	    TreeNode left = ReinvertTree(root.left);
	    root.left = right;
	    root.right = left;
	    return root;
	}

	//큐 이용 - 부모 노드부터 스왑하면서 계속 아래로 내려가서 스왑
    public TreeNode QuinvertTree(TreeNode root) {
    	Queue<TreeNode> que = new LinkedList<>();
    	que.add(root);
    	
    	while(!que.isEmpty()) {
    		TreeNode node = que.poll();
    		if(node != null) {
    			TreeNode temp = node.left;
    			node.left = node.right;
    			node.right = temp;
    		}
    		que.offer(node.left);
    		que.offer(node.right);
    	}
    	
    	return root;
    }
    
    //스택이용 - 큐와 동일한 방식
    public TreeNode StinvertTree(TreeNode root) {
    	Stack<TreeNode> stack = new Stack<>();
    	stack.add(root);
    	
    	while(!stack.isEmpty()) {
    		TreeNode node = stack.pop();
    		if(node != null) {
    			TreeNode temp = node.left;
    			node.left = node.right;
    			node.right = temp;
    			
    			stack.add(node.left);
    			stack.add(node.right);
    		}
    	}
    	return root;
    }
    
	public static void main(String args[]) {
    	TreeNode lLeftN2 = new TreeNode(1,null,null);
    	TreeNode lRightN2 = new TreeNode(3,null,null);
    	TreeNode leftN1 = new TreeNode(2,lLeftN2,lRightN2);
    	TreeNode rLeftN2 = new TreeNode(6,null,null);
    	TreeNode rRightN2 = new TreeNode(9,null,null);
    	TreeNode rightN1 = new TreeNode(7,rLeftN2,rRightN2);
    	TreeNode node = new TreeNode(4,leftN1,rightN1);
    	
    	이진트리반전 izy = new 이진트리반전();
    	izy.ReinvertTree(node);
    	izy.QuinvertTree(node);
    }
}
