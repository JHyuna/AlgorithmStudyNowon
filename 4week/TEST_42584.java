package week3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TEST_42584 {

	public static void main(String[] args) {

	}

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			int cnt = 0;
			for(int j = i+1; j < prices.length; j++) {
				cnt++;
				if(prices[j] < prices[i]) {
					answer[i] = cnt;
					break;
				}
			}
			if(answer[i] == 0) {
				answer[i] = cnt;
			}
		}

		return answer;
	}

}
