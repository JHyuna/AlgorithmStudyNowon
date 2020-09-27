package programmers;

import java.util.ArrayList;
import java.util.List;

public class 네트워크 {
	public int solution(int n, int[][] computers) {
        int count = 0;
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        	list.add(new ArrayList<Integer>());
        
        // 그래프생성
        for(int i=0;i<computers.length;i++) {
        	for(int j=0;j<computers[i].length;j++) {
        		if(computers[i][j] == 1) {
        			list.get(i).add(j);
        		}
        	}
        }
        
        //방문했는지 기록
        boolean[] visited = new boolean[list.size()];
        for(int i=0;i<list.size();i++) {
        	if(visited[i] == false) {
        		dfs(list,visited,i);
        		count++;
        	}
        }
        
        return count;
    }
	
	private void dfs(List<ArrayList<Integer>> list, boolean[] visited, int i) {
		if(visited[i] == true)
			return;
		
		visited[i] = true;
		
		// 연결된 것들 가져와서 다시 탐색
		for(int k : list.get(i)) {
			if(i != k) {
				dfs(list,visited,k);
			}
		}
	}
}
