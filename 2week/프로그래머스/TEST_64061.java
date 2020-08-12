package kakao.Yearang.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//	https://programmers.co.kr/learn/courses/30/lessons/64061?language=java

//	[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4

public class TEST_64061 {

	public static void main(String[] args) {
		int[][] test = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		solution(test, moves);
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Queue<Integer>> boardAl = new ArrayList<>();
	
		// board를 큐에 넣기
		for (int i = 0; i < board.length; i++) {
			Queue<Integer> tmp = new LinkedList<Integer>();
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] != 0) {
					tmp.add(board[j][i]);
				}
			}
			boardAl.add(i, tmp);
		}

		// 인형뽑기 시작!
		for (int tmp : moves) {
			if (boardAl.get(tmp - 1).size() > 0) {	// 스택에 숫자가 있으면
				int tempMove = boardAl.get(tmp - 1).poll();	//하나뽑아서
				if (!stack.isEmpty() && stack.peek() == tempMove) {	// 바구니에 담기 1. 만약 바구니의 제일 위에 있는 인형이랑 같으면
					stack.pop();	// 바구니에서 인형을 빼고
					answer += 2;	// 두개 터트림
				} else {			// 바구니에 담기 2. 그냥 바구니에 담기
					stack.add(tempMove);
				}
			}
		}

		return answer;
	}

}
