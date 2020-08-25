package week3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TEST_42586 {

	public static void main(String[] args) {
		int[] a = {93,30,55};
		int[] b = {1,30,5};
		solution(a,b);
	}
	
	
    public static int[] solution(int[] progresses, int[] speeds) {
    	int max = 0;
    	int count = 0;
    	
    	// 우선순위 큐 -> 정렬기준 : 배포일
    	 PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
    		 
    	 });
    	 
    	for(int i = 0 ; i < progresses.length; i++) {
    		double tmpDay = Math.ceil((100.0-progresses[i])/speeds[i]);	// 작업일 계산
    		
    		// max가 없으면 초기값 할당
    		if(max == 0) {
    			 max = (int)tmpDay;
    			 count++;
    		} else if(max < tmpDay) {	// max보다 오래걸리면 큐에 넣어줌
    			int[] tmp = {max,count};	// 배포일, 개수
    			pq.add(tmp);
    			max = (int) tmpDay;
    			count = 1;
    		} else {
    			count++;
    		}
    		
    		// 마지막이면 무조건 넣어줌
    		if(i == progresses.length - 1 ) {
    			int[] tmp = {max,count};
    			pq.add(tmp);
    		}
    	}
    	
    	
    	// 정답 배열에 넣어주기
    	int[] answer = new int[pq.size()];
    	int i = 0;
    	for(int[] tmp : pq) {
    		answer[i] = tmp[1];
    		i++;
    	}
    	
        return answer;
        
    }

}
