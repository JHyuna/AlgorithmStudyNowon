package kakao.Yearang.test;

import java.util.ArrayList;
import java.util.Comparator;

//	https://programmers.co.kr/learn/courses/30/lessons/42889?language=java - 실패율

public class TEST_42889 {

	public static void main(String[] args) {
		int[] test = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, test);

	}

	public static int[] solution(int N, int[] stages) {
		int []answer  = new int[N];
		ArrayList<Integer> stageAl = new ArrayList<Integer>();
		for (int i : stages) {
			stageAl.add(i);
		}

		ArrayList<double []> failRate = new ArrayList<>();
		

		for (int i = 1; i <= N; i++) {
			int players = 0; // 스테이지에 도달한 플레이어 수
			int fail = 0; // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
			for (int j : stageAl) {
				if (j >= i) {
					players++;
				}
				if (j <= i) {
					fail++;
				}
			}
			int tempi = i;
			stageAl.removeIf(x -> x <= tempi);
			double[] tmp = new double[2];
			tmp[0] = i;
			if(players == 0) {	// 스테이지에 도달한 유저가 없는 경우 -> 0
				tmp[1] = 0.0;
			} else {
				tmp[1] = fail / (double)players;
			}
			failRate.add(tmp);
		}
		
		
		// 정렬
		failRate.sort(new Comparator<double[]>() {

			@Override
			public int compare(double[] o1, double[] o2) {
				int res = 0;
				if(o1[1] < o2[1]) {	// 실패율 비교
					res = 1;
				} else if(o1[1] > o2[1]){
					res = -1;
				} else {	//실패율이 같을 경우 -> 인덱스 번호로 정렬
					if(o1[0] > o2[0]) {	
						res = 1;
					} else {
						res = -1;
					}
				}
				return res;
			}
			
		});
		
		// 정렬한 인덱스를 정답배열에 넣어줌
		for(int i = 0 ; i < N ; i++) {
			answer[i] = (int) failRate.get(i)[0];
//			System.out.println(failRate.get(i)[0]);
		}

		return answer;
	}

}
