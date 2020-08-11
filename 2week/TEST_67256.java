package kakao.Yearang.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

//	https://programmers.co.kr/learn/courses/30/lessons/67256?language=java - 키패드 누르기
//	
//	입출력 예
//	numbers	hand	result
//	[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
//	[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
//	[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"

//	엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
//	왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
//	오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
//	가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
//	4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.

public class TEST_67256 {

	public static void main(String[] args) {
		int[] test = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		solution(test, "right");
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int beforeL = -1; // 왼손은 *
		int beforeR = -2; // 오른손은 #에서 시작

		// 키패드
		HashMap<Integer, int[]> hm = new HashMap<Integer, int[]>();
		hm.put(1, new int[] { 0, 0 });
		hm.put(2, new int[] { 0, 1 });
		hm.put(3, new int[] { 0, 2 });
		hm.put(4, new int[] { 1, 0 });
		hm.put(5, new int[] { 1, 1 });
		hm.put(6, new int[] { 1, 2 });
		hm.put(7, new int[] { 2, 0 });
		hm.put(8, new int[] { 2, 1 });
		hm.put(9, new int[] { 2, 2 });
		hm.put(0, new int[] { 3, 1 });
		hm.put(-1, new int[] { 3, 0 }); // *
		hm.put(-2, new int[] { 3, 2 }); // #
		
		int[] left = { 1, 4, 7 };
		int[] right = { 3, 6, 9 };
		
		for (int i : numbers) {
			if (IntStream.of(left).anyMatch(x -> x == i)) { // 왼손열인 경우
				answer += "L";
				beforeL = i;
			} else if (IntStream.of(right).anyMatch(x -> x == i)) { // 오른손열인 경우
				answer += "R";
				beforeR = i;
			} else { // 가운데열인 경우
				// 거리 게산
				int[] tmpi = hm.get(i);
				int[] tmpl = hm.get(beforeL).clone();	// 왼손좌표
				int[] tmpr = hm.get(beforeR).clone();	// 오른손좌표
				int movel = 0;	//왼손거리
				int mover = 0;	//오른손거리
				if(tmpl[1] != 1) {
					movel++;
					tmpl[1] = 1;
				}
				if(tmpr[1] != 1) {
					mover++;
					tmpr[1] = 1;
				}
				movel += Math.sqrt(Math.pow((tmpl[0] - tmpi[0]), 2) + Math.pow((tmpl[1] - tmpi[1]), 2));
				mover += Math.sqrt(Math.pow((tmpr[0] - tmpi[0]), 2) + Math.pow((tmpr[1] - tmpi[1]), 2));
				
				if(movel < mover) {	// 왼손거리가 더 짧으면
					answer += "L";
					beforeL = i;
				} else if(movel > mover) {	// 오른손거리가 더 짧으면					
					answer += "R";
					beforeR = i;
				} else {	// 두 거리가 같으면
					if(hand.equals("left")) {	// 왼손잡이이면 왼손으로
						answer += "L";
						beforeL = i;
					} else {					// 오른손잡이면 오른손으로
						answer += "R";
						beforeR = i;
					}
				}

			}

		}
		return answer;
	}

}
