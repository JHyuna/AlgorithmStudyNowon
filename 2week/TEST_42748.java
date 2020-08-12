package kakao.Yearang.test;

import java.util.Arrays;

//	https://programmers.co.kr/learn/courses/30/lessons/42748?language=java - K번째 수

public class TEST_42748 {

	public static void main(String[] args) {

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int answerIdx = 0;
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);	// 자르기
			Arrays.sort(temp);	// 정렬
			answer[answerIdx] = temp[commands[i][2] - 1];	// k번째 수
			answerIdx++;
		}
		return answer;
	}

}
