package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 색종이 {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int con = Integer.parseInt(br.readLine());
		
		int count = 0;
		boolean[][] space = new boolean[100][100];
		for(int i=0;i<con;i++) {
			String[] buf = br.readLine().split(" ");
			int a = Integer.parseInt(buf[0]);
			int b = Integer.parseInt(buf[1]);
			
			for(int n = a; n < a+10; n++) {
				for(int m = b; m < b+10; m++) {
					space[n][m] = true;
 				}
			}
		}
		
		for(int n = 0;n<100;n++) {
			for(int m = 0; m <100; m++) {
				if(space[n][m]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
