package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 매우 빠른 정렬 알고리즘 - Counting sort */
/* System.out.println 대신 StringBuilder로 append 해주어 출력하는 것이 빠름 */
public class 수정렬하기2 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[2000001];
		for(int i=0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())+1000000]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0)
				sb.append((i - 1000000) + "\n");
		}
		
		System.out.println(sb);
	}
}
