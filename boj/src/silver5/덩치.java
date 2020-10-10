package silver5;

import java.util.Scanner;

public class 덩치 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] res = new int[n];
		int c = 0,k = 0;
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == j) {
					continue;
				}
				else if(a[i] < a[j]) {
					if(b[i] < b[j]) {
						c+=1;
					}
				}
				
				if(c > 0) {
					res[k] +=1;
				}
				c = 0;
			}
			res[k]+=1;
			k++;
		}
	
		for(int m : res) {
			System.out.print(m + " ");
		}
	}
}