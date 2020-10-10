package week3;

import java.util.LinkedList;
import java.util.Queue;

public class TEST_42587 {

	public static void main(String[] args) {

	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<int[]> queue = new LinkedList<>();
		
		// 남아있는 큐 중에 최대값
		int max = 0;
		
		// int 배열 -> 큐에 넣어줌
		for (int i = 0; i < priorities.length; i++) {
			if(priorities[i] > max) {
				max = priorities[i];
			}
			queue.add(new int[] { priorities[i], i });	// [중요도, index]
		}
		
		
		while(!queue.isEmpty()) {
			 int[] tmp = queue.poll();
			 if(tmp[0] < max) {				// 최대값보다 작으면 다시 큐에 넣어주기
				queue.add(tmp); 
			 } else {
				 answer++;
				 if(tmp[1] == location) {	// 프린트 했는데 index == location이면 return
					 return answer; 
				 }
				 
				 max = 0;					// max값 초기화
				 for(int[] tmpQ : queue) {	// max 다시찾기
					 if(tmpQ[0] > max) {
							max = tmpQ[0];
						}
				 }
			 }
		}
		
		return answer;
	}

}
