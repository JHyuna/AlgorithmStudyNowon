package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 조합 {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		dfs(list,new ArrayList(),1,n,k);
		return list;
	}
	
	private void dfs(List<List<Integer>> list, ArrayList<Integer> tempList, int start, int n, int k) {
		if(k == 0) {
			list.add(new ArrayList<>(tempList));
			return;
		}
		
		for(int i=start;i<=n;i++) {
			tempList.add(i);
			dfs(list,tempList,i+1,n,k-1);
			tempList.remove(tempList.size()-1);
		}
	}
	public static void main(String[] args) {
		int n = 4,k = 2;
		조합 jo = new 조합();
		List<List<Integer>> ans = jo.combine(n, k);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
