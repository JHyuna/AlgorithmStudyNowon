package silver5;

import java.util.Scanner;

public class 달팽이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int find = sc.nextInt();
		int i = 0,j=0;
		int[][] arr = new int[n][n];
		
		int k = n*n;
		int ch = 0;
		for(int m = n; m>0; m--) {
			for(i=ch;i<m;i++) {
				arr[i][j] = k;
				//System.out.println("1: "+i+", "+j);
				k = k-1;
			}
			i=m-1;
			for(j=ch+1;j<m;j++) {
				arr[i][j] = k;
				//System.out.println("2: "+i+", "+j);
				k = k-1;
			}
			j=m-1;
			for(i=m-2;i>=ch;i--) {
				arr[i][j] = k;
				//System.out.println("3: "+i+", "+j);
				k = k-1;
			}
			i=ch;
			for(j=m-2;j>ch;j--) {
				arr[i][j] = k;
				//System.out.println("4: "+i+", "+j);
				k = k-1;
			}
			j=ch+1;
			ch++;
		}
		int x = 0, y =0;
		for(int a=0;a<n;a++) {
			for(int b=0;b<n;b++) {
				System.out.print(arr[a][b] + " ");
				if(arr[a][b] == find) {
					x= a;
					y = b;
				}
			}
			System.out.println();
		}
		System.out.println((x+1)+" "+(y+1));
	}

}
