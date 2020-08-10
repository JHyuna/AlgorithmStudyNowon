package week1;


public class 소수찾기 {
	
	// n까지의 수 가운데 소수가 몇개 존재하는가?
	public int solution(int n) {
		int[] sosu = new int[n+1];
		int ch = 0;
		
		for(int i=1;i<n+1;i++) {
			sosu[i] = i;
		}
		
		for(int i=2;i<n+1;i++) {
			for(int j=i+i;j<n+1;j+=i) {
				if(sosu[j] == 0) continue;
				sosu[j] = 0;
			}
		}
		
		for(int i=2;i<n+1;i++) {
			if(sosu[i] != 0) {
				ch+=1;
			}
		}
		return ch;
		
	}
	
	// 헤당 수가 소수인가?
	public boolean solution1(int n) {
		for(int i=2; i<(int)Math.sqrt(n)+1; i++) {
			if(n%i == 0) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		소수찾기 so = new 소수찾기();
		System.out.println(so.solution(10));
		System.out.println(so.solution1(10));
	}	
}


