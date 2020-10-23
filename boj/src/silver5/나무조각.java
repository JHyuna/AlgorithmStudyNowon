package silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 나무조각 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list = br.readLine();
		String[] sp = list.split(" ");
		int[] ch = new int[sp.length];
		int count = 0;
		for(int i=0;i<sp.length;i++) {
			ch[i] = Integer.parseInt(sp[i]);
		}
		
OUTER :	while(true) {
			for(int i=0;i<ch.length-1;i++) {
				if(ch[i] > ch[i+1]) {
					int temp = ch[i];
					ch[i] = ch[i+1];
					ch[i+1] = temp;
				}else {
					continue;
				}
				int k = 1;
				for(int c : ch) {
					System.out.print(c + " ");
					if(c == k) {
						count++;
					}
					k++;
				}
				System.out.println();
				
				if(count == 5) {
					break OUTER;
				}
				count = 0;
			}
		}	
	}

}
