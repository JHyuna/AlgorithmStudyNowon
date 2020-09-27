package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 조합의합 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(candidates.length != 0) {
			dfs(list,new ArrayList<Integer>(),0,candidates,target);
		}
		
		return list;
	}
	
	private void dfs(List<List<Integer>> list,ArrayList<Integer> tempList, int start,int[] candidates, int target) {
		if(target == 0) {
			list.add(new ArrayList<>(tempList));
		}
		
		for(int i=start;i<candidates.length;i++) {
			if(target > 0) {
				tempList.add(candidates[i]);
				dfs(list,tempList,i,candidates,target-candidates[i]);
				tempList.remove(tempList.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int[] candidates = {2,3,5};
		int target = 8;
		조합의합 jo = new 조합의합();
		List<List<Integer>> ans = jo.combinationSum(candidates, target);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
