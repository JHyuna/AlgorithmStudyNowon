package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프린터 {
	
	//요소의 위치가 변할때 해당 location의 위치도 함께 변경
		public int solution(int[] priorities, int location) {
			List<Integer> list = new ArrayList<>();
			int loc = location, cnt = 0;
			for(int p : priorities) {
				list.add(p);
			}
			
			while(!list.isEmpty()) {
				int max_priority = list.get(0);
				for(int i=0;i<list.size();i++) {
					// 현재 max_priority보다 큰 수가 있다면 if문으로 들어가지 않아서  max_priority의 값이 0이 아님
					if(list.get(0) < list.get(i)) {
						if(loc == 0) {
							loc = list.size()-1;
						}else {
							loc--;
						}
						
						int temp = list.get(0);
						list.remove(0);
						list.add(temp);
						max_priority = 0;
						break;
					}
				}
				// 제일 큰 수일 경우 max_priority 값이 0이 아님
				if(max_priority != 0) {
					list.remove(0);
					cnt++;
					if(loc == 0)
						break;
					else {
						loc--;
					}
				}
			}
			return cnt;
		}
		
		
		public int solution2(int[] priorities, int location) {
			int answer = 0;
			int l = location;
			
			Queue<Integer> que = new LinkedList<Integer>();
			for(int i : priorities) {
				que.add(i);
			}
			
			Arrays.sort(priorities);
			int size = priorities.length-1;
			
			while(!que.isEmpty()) {
				Integer i = que.poll();
				if(i == priorities[size-answer]) {
					answer++;
					l--;
					if(l < 0)
						break;
				}else {
					que.add(i);
					l--;
					if(l < 0) {
						l = que.size()-1;
					}
				}
				
			}
			return answer;
		}
    
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 0;
		프린터 p = new 프린터();
		//p.solution(priorities, location);
		System.out.print(p.solution2(priorities, location));
	}

}
