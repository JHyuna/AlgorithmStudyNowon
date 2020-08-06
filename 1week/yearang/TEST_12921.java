package kakao.Yearang.test;

import java.util.ArrayList;

/* 어렵!!! */
//	소수 찾기

//	문제 설명
//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//	
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//	(1은 소수가 아닙니다.)
//	
//	제한 조건
//	n은 2이상 1000000이하의 자연수입니다.
//	입출력 예
//	n	result
//	10	4
//	5	3
//	입출력 예 설명
//	입출력 예 #1
//	1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
//	
//	입출력 예 #2
//	1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

public class TEST_12921 {

	public static void main(String[] args) {
		solution(83);
	}

	public static int solution(int n) {
		int answer = 0;
		ArrayList<Integer> decimal = new ArrayList<Integer>();

//		for (int i = 2; i <= n; i++) {
//			boolean flag = true;
//			
//			for(int j : decimal) {
//				if(i % j == 0) {
//					flag = false;
//					break;
//				}
//			}
//			System.out.println(i + " " + decimal.toString());
//
//			if (flag) {
//				decimal.add(i);
//				answer++;
//			}
//		}

		/* 에라토스테네스의_체 */
		boolean[] prime = new boolean[n + 1];
		/* 0, 1은 소수가 아님 */
		prime[0] = false;
		prime[1] = false;

		/* true로 초기화 */
		for (int i = 2; i <= n; i++) {
			prime[i] = true;
		}

		// 2부터 n까지 소수의 배수를 제외함
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				for (int j = i * 2; j <= n; j += i) {
					prime[j] = false;	
				}
			}
		}

		for (boolean b : prime) {
			if (b == true) {
				answer++;
			}
		}

		return answer;
	}

}
