package week3;

import java.util.LinkedList;
import java.util.Queue;

public class TEST_42583 {

	public static void main(String[] args) {
		solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 });
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> truck = new LinkedList<Integer>();
		Queue<int[]> bridge = new LinkedList<>();
		for (int i : truck_weights) {
			truck.offer(i);
		}
		int onBridge = 0;
		while (!truck.isEmpty() || !bridge.isEmpty()) {	// 트럭이랑 다리위에 아무것도 없을때까지
			int bsize = bridge.size();
			for (int i = 0; i < bsize; i++) {	// 1씩 이동시키면서
				int[] tmpT = bridge.poll();
				if (tmpT[1] + 1 > bridge_length) { // 트럭이 도로를 벗어나면
					onBridge -= tmpT[0];			// 도로에서 뺌
				} else {
					bridge.offer(new int[] { tmpT[0], tmpT[1] + 1 });	// 도로를 벗어나지 않으면 위치만 1 더해서 넣어줌
				}
			}
			if (!truck.isEmpty()) {		// 트럭 큐가 비어있지 않다면
				if (onBridge + truck.peek() <= weight) {	// 도로에 트럭올릴 무게가 남아있다면 올림
					int tmpT = truck.poll();
					onBridge += tmpT;
					bridge.offer(new int[] { tmpT, 1 });
				}
			}
			answer++;
		}

		return answer;

	}

}
