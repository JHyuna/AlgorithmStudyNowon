package week1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
	
	public int[] solution(int n,int m) {
		int[] answer = {1, n*m};
		
		if(n<m) {
			for(int i=2;i<=n;i++) {
				if(m%i == 0 && n%i == 0) {
					//System.out.println(i);
					answer[0] = i;
				}
			}
			
			for(int i=1;i<m;i++) {
				if( n*i%m ==0) {
					answer[1] = n*i;
					break;
				}
			}
		}
        else{
            for(int i=2;i<=m;i++) {
				if(m%i == 0 && n%i == 0) {
					//System.out.println(i);
					answer[0] = i;
				}
			}
			
			for(int i=1;i<m;i++) {
				if( m*i%n ==0) {
					answer[1] = m*i;
					break;
				}
			}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n=2, m=5;
		최대공약수와최소공배수 ch = new 최대공약수와최소공배수();
		for(int i=0; i <ch.solution(n, m).length; i++) {
			System.out.println(ch.solution(n, m)[i]);
		}
	}

}
