package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 순열 {
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}
	        
	private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
		if(tempList.size() == nums.length) {
			System.out.println("tempList : "+tempList);
			list.add(new ArrayList<>(tempList));
		}
		else {
			for(int i=0;i<nums.length;i++) {
				if(tempList.contains(nums[i])) continue;
				tempList.add(nums[i]);
				backtrack(list,tempList, nums);
				tempList.remove(tempList.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		순열 sun = new 순열();
		List<List<Integer>> ans = sun.permute(nums);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j));
			}
			System.out.println();
		}
	}

}
