package week1;

public class x만큼간격이있는n개의숫자 {
	
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long k = (long)x;
		
		for(int i=0;i<n;i++) {
			answer[i] = k;
			k+=x;
		}
		
		return answer;	
	}
//	public static void main(String[] args) {
//		int x = 100000000, n = 1000;
//		x만큼간격이있는n개의숫자 xn = new x만큼간격이있는n개의숫자();
//		for(int i=0;i<n;i++) {
//			System.out.print(xn.solution(x, n)[i]);
//		}
//		
//	}
}
