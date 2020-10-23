package silver3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 프린터큐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0,count = 1;
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Queue<Integer> que = new LinkedList<>();
			int a = sc.nextInt();
			int loc = sc.nextInt();
			for(int j=0;j<a;j++) {
				que.add(sc.nextInt());
			}
			
			while(!que.isEmpty()) {
				for(int k : que) {
					big = Math.max(big, k);
				}
				
				if(que.peek() != big) {
					if(loc == 0) {
						loc = que.size()-1;
						int po = que.poll();
						que.add(po);
					}
					else {
						loc--;
						int po = que.poll();
						que.add(po);
					}
				}else {
					if(loc == 0) {
						que.poll();
						break;
					}else {
						loc--;
						int p = que.poll();
						count++;
						big = 0;
					}
				}
			}
			
			System.out.println(count);
			count = 1;
			big = 0;
		}
	}
}
