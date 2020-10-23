package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 에라토스테네스의체 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		int count = 0, bee = 2, ans = 0, ansCount = 0;
		
		for(int i = 2; i <= N; i++) {
			que.add(i);
		}
		
		int r = que.size();
		
		while(!que.isEmpty()) {
			if(que.peek() % bee == 0) {
				ans = que.poll();
				ansCount++;
				count++;
			}else {
				int pol = que.poll();
				que.add(pol);
				count++;
			}
			if(count == r) {
				r = que.size();
				bee++;
				count = 0;
			}
			if(ansCount == K) {
				break;
			}
		}
		System.out.println(ans);
	}
	
	//다른 사람 풀이
//	public void goodAristo() throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		boolean[] prime = new boolean[N + 1];
//		
//		int cnt = 0;
//		for(int i = 2; i <= N; i++) {
//			for(int j = i; j <= N; j += i) {
//				if(prime[j] == false) {
//					cnt++;
//					prime[j] = true;
//					if(cnt == K) {
//						sb.append(j);
//					}
//				}
//			}
//		}
//		System.out.println(sb.toString());
//	}
}
