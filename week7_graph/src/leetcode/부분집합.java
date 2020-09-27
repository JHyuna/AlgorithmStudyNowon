package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 부분집합 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		dfs(list,0,new ArrayList<Integer>(),nums);
		return list;
    }
	
	private void dfs(List<List<Integer>> list, int start,ArrayList<Integer> tempList, int[] nums) {
		if(!list.contains(tempList)) {
			list.add(new ArrayList<>(tempList));
		}
		
		for(int i=start;i<nums.length;i++) {
			tempList.add(nums[i]);
			dfs(list,i+1,tempList,nums);
			tempList.remove(tempList.size()-1);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		부분집합 sun = new 부분집합();
		List<List<Integer>> ans = sun.subsets(nums);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j));
			}
			System.out.println();
		}
	}

}
