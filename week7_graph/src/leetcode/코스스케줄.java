package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 코스스케줄 {
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Set<Integer> set = new HashSet<Integer>();
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<numCourses;i++)
			list.add(new ArrayList<Integer>());
		for(int i=0;i<prerequisites.length;i++) {
			list.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}
		
		for(int i=0;i<list.size();i++) {
			if(!dfs(i,list,set)) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs(int i, List<ArrayList<Integer>> list, Set<Integer> set) {
		if(set.contains(i)) {
			return false;
		}
		set.add(i);
		System.out.println(i+" "+set);
		for(int k : list.get(i)) {
			if(!dfs(k,list,set)) {
				return false;
			}
		}
		//i=0,1,2 등 각각의 순서에서의 연결 요소들을 모두 지워주는 역할
		//재귀로 리턴되면서 모두 지워줘
		set.remove(i);
		System.out.println("re: "+set);
		return true;
	}
	
	// 최적화 코드
	public boolean canFinish1(int numCourses, int[][] prerequisites) {
		Set<Integer> traced = new HashSet<Integer>();
		Set<Integer> visited = new HashSet<Integer>();
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<numCourses;i++)
			list.add(new ArrayList<Integer>());
		for(int i=0;i<prerequisites.length;i++) {
			list.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}
		
		for(int i=0;i<list.size();i++) {
			if(!dfs1(i,list,traced,visited)) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs1(int i, List<ArrayList<Integer>> list, Set<Integer> traced, Set<Integer> visited) {
		if(traced.contains(i))
			return false;
		if(visited.contains(i))
			return true;
			
		traced.add(i);
		System.out.println(i+" "+traced);
		for(int k : list.get(i)) {
			if(!dfs1(k,list,traced,visited))
				return false;
		}
		traced.remove(i);
		visited.add(i);
		System.out.println("re: "+traced+" "+visited);
		return true;
	}
	

	public static void main(String[] args) {
		int numCourses = 3;
		int[][] prerequisites = {{0,1},{0,2},{1,2}};
		코스스케줄 cos = new 코스스케줄();
		//System.out.println(cos.canFinish(numCourses, prerequisites));
		System.out.println(cos.canFinish1(numCourses, prerequisites));
	}

}
