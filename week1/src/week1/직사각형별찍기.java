package week1;

import java.util.Scanner;

class 직사각형별찍기 {
	
    public void solution(int n,int m) {
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			System.out.print('*');
    		}
    		System.out.println();
    	}
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		직사각형별찍기 sol = new 직사각형별찍기();
		sol.solution(n,m);
	}
}
