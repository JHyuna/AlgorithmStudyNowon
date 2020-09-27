package programmers;

import java.util.Arrays;
import java.util.Stack;

// 전형적인 DFS문제는 하나를 선택하느냐 아니면 선택하지 않고 그 다음 인덱스를 선택하거나의 유형
// 선택했을 때 그 배열안 데이터가 양수인지 음수인지를 판별하는 방식. flag변수는 계속 증가하게 만들고 
// 최종 계산을 위한 SUM값은 해당 인덱스의 데이터의 총합을 담당하게 둠.
public class 타겟넘버 {
	static int total_len;
	static int targetNum;
	static int count;
	
	public static int solution(int[] numbers, int target) {
		total_len = numbers.length;
		targetNum = target;
		count =0;
		
		DFS(0,0,numbers);
		int answer = count;
		return answer;
	}
	
	private static void DFS(int flag, int sum, int[] compNum) {
		//재귀에 의해 flag값이 numbers의 길이와 같아질 경우
		//재귀를 빠져나와야 함. 
		if(flag == total_len) {
			// 그때 target과 sum이 같으면 count 하나 증가
			if(targetNum == sum) {
				count++;
				return;
			}
			//같지 않으면 재귀 빠져나와
			else {
				return;
			}
		}
		
		int tmpNum = compNum[flag];
		//numbers의 배열길이 만큼 반복하기 위해 flag값을 1씩 증가시킴.
		//+연산을 위한
		DFS(flag+1,sum+tmpNum, compNum);
		//-연산을 위한
		DFS(flag+1,sum-tmpNum, compNum);
	}

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		타겟넘버 tar = new 타겟넘버();
		System.out.print(tar.solution(numbers, target));
	}

}
