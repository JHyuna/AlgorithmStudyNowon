package leetcode;

import java.util.Arrays;

public class 정렬된배열의이진탐색트리변환 {
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
	
	public TreeNode sortedArrayToBST(int[] nums) {	
		if(nums.length == 0)
			return null;
		TreeNode head = helper(nums,0,nums.length-1);
		return head;
	}
	
	private TreeNode helper(int[] nums, int low, int height) {
		if(low > height)
			return null;
		int mid = (low+height)/2;
		System.out.println(mid);
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums,low,mid-1);
		node.right = helper(nums,mid+1,height);
		return node;
	}

	public static void main(String args[]) {
		int[] nums = {-10,-3,0,5,9};
		정렬된배열의이진탐색트리변환 tran = new 정렬된배열의이진탐색트리변환();
		tran.sortedArrayToBST(nums);
	}
}
