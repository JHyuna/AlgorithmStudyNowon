package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스위치켜고끄기 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int switchLen = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] state = new int[switchLen];
		int m = 0;
		
		while(st.hasMoreTokens()) {
			state[m++] = Integer.parseInt(st.nextToken());
		}
		
		//학생수
		int studentCon = Integer.parseInt(bf.readLine());
		//학생 성별, 학생 받은 수
		for(int i=0;i<studentCon;i++) {
			StringTokenizer st2 = new StringTokenizer(bf.readLine());
			int sexual = Integer.parseInt(st2.nextToken());
			int num = Integer.parseInt(st2.nextToken());

			if(sexual == 1) {
				for(int j=1; j<=state.length;j++) {
					if(j % num == 0) {
						state[j-1] = 1-state[j-1];
					}
				}
			}else {
				for(int j=1; j<=state.length; j++) {
					if(num-1-j >=0 && num-1+j < state.length && state[num-1-j] == state[num-1+j]) {
						state[num-1-j] = 1-state[num-1-j];
						state[num-1+j] = 1-state[num-1+j];
					}else {
						break;
					}
				}
				state[num-1] = 1-state[num-1];
			}
		}
		
		for(int k=0; k < switchLen; k++) {
			if(k!=0 && k%20==0) {
				System.out.println();
	        }
			System.out.print(state[k] + " ");
		}
		
	}

}
