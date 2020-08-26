package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0, i = 0, total = 0;
        int ch = 0, idx = 0;
        Queue<Integer> que = new LinkedList<>();
        
        for(int j=0;j<bridge_length;j++) {
        	que.add(0);
        }
       
        while(i < truck_weights.length) {
        	if(que.size() == bridge_length) {
        		//poll한 만큼을 측정
        		idx = que.poll();
        		total-= idx;
        	}
        	if(total+truck_weights[i] <= weight) {
        		que.add(truck_weights[i]);
        		//System.out.println(que);
        		total += truck_weights[i];
        		i++;
        		time+=1;
        	}else {
        		que.add(0);
        		time++;
        		//System.out.println(que);
        	}
        }
       
        time+=bridge_length;
        return time;
    }
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		다리를지나는트럭 da = new 다리를지나는트럭();
		System.out.print(da.solution(bridge_length, weight, truck_weights));
	}
}
