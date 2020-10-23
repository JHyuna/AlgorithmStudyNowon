package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 통계학 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//입력값의 범위 : -4000 ~ 4000
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
			
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		// 중앙값 빈도 누적 수
		int count = 0;
		// 최빈값의 최댓값
		int mode_max = 0;
		
		boolean flag = false;
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				
				//중앙값 구하기
				if(count < (N+1)/2) {
					count += arr[i];
					median = i - 4000;
				}
				
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				}
				//최빈값이 여러개 있을 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);
	}

}
