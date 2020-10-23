package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제2 {
	
	// 내 풀이 - 메모리 초과
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
			
		int count = 0, adding = 0;
		Queue<Integer> que = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = 1; i <= N; i++) {
			que.add(i);
		}
			
		while(!que.isEmpty()) {
			if(count < R-1) {
				int pol = que.poll();
				que.add(pol);
				count++;
			}else if(count == R-1) {
				int p = que.poll();
				sb.append(p);
				if(adding < N-1)
					sb.append(", ");
				count=0;
				adding++;
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
	
	//다른 사람 풀이
	private static final String PRE = "<";
	private static final String SPACE = ", ";
	private static final String POST = ">";
	
	public void otherAnswer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()) -1;
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i < N+1; i++) {
			arr.add(i);
		}
		
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(PRE);
		
		while(!arr.isEmpty()) {
			idx += M;
			int size = arr.size();
			
			if(idx >= size) {
				idx %= size;
			}
			sb.append(arr.remove(idx)).append(SPACE);
		}
		//마지막에 SPACE 는 제거 하기 위해 
		System.out.println(sb.substring(0, sb.length() - 2) + POST);
	}
}
