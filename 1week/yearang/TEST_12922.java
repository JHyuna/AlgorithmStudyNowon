package kakao.Yearang.test;

//	수박수박수박수박수박수?
//	문제 설명
//	길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
//	
//	제한 조건
//	n은 길이 10,000이하인 자연수입니다.
//	입출력 예
//	n	return
//	3	수박수
//	4	수박수박

public class TEST_12922 {

	public static void main(String[] args) {

	}

	public static String solution(int n) {
		String answer = "";

		int i = 1;
		while (i != n + 1) {
			if (i % 2 == 1) {
				answer += "수";
			} else {
				answer += "박";
			}
			i++;
		}

		return answer;
	}

}
