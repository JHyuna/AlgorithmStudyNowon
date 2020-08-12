package kakao.Yearang.test;

import java.util.Arrays;

public class TEST_42840 {

	public static void main(String[] args) {
		int[] test = { 1, 2, 3, 4, 5 };
		int[] test1 = { 2,1,2,3,2,4,2,5 };
		solution(test);
		solution(test1);
	}

	public static int[] solution(int[] answers) {
		int[] answer = new int[3];
		final int NUM_OF_STUDENT = 3;
		final int[][] GUESS = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int[] i = { 0, 0, 0 };
		int[] answerList = { 0, 0, 0 };
		final int[] LENGTH = { GUESS[0].length, GUESS[1].length, GUESS[2].length };

		int max = 0;

		for (int a : answers) {
			for (int j = 0; j < NUM_OF_STUDENT; j++) {
				if (GUESS[j][i[j]] == a) {
					answerList[j]++;
					if (max < answerList[j]) {
						max = answerList[j];
					}
				}
				// 인덱스++
				i[j]++;
				if (i[j] >= LENGTH[j]) {	// 최대길이 넘으면 0으로 초기화
					i[j] = 0;
				}
			}

		}

		// 최대값인애들만 정답배열에 넣기
		int answerIdx = 0;
		for (int j = 0; j < NUM_OF_STUDENT; j++) {
			if (max == answerList[j]) {
				answer[answerIdx] = j + 1;
				answerIdx++;
			}
		}
		answer = Arrays.copyOf(answer, answerIdx);
		System.out.println(Arrays.toString(answer));

		return answer;
	}
}
