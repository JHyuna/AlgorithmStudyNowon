package solved;

import java.util.Scanner;

public class 숫자정사각형 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] jic = new int[n][m];
		int k=0, count = 0;
		
		
		for(int i=0;i<n;i++) {
			String star = sc.next();
			for(int j=0;j<m;j++) {
				jic[i][j] = star.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				while(i+k < n && j+k < m) {
					if(jic[i][j] == jic[i][j+k] && jic[i][j] == jic[i+k][j] && jic[i][j] == jic[i+k][j+k])
					{	
						int amount = (k+1)*(k+1);
						count = Math.max(count,amount);
					}
					k++;
				}
				k=0;
			}
		}
		
		System.out.println(count);
	}
}
