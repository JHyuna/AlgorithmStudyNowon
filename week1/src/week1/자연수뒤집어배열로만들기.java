package week1;

public class 자연수뒤집어배열로만들기 {
	
	// 풀이 1
	public int[] solution(long n) {
		
		// string + int 를 할 경우 string 으로 인식함.
		String a = ""+n;
		int[] answer = {};
		int i = 0;
		
		answer = new int[a.length()];
		
		while(n >= 10) {
			answer[i] = (int)(n%10);
			//System.out.println(answer[i]);
			n = n/10;
			i++;
		}
		answer[i] = (int) n;
		return answer;
	}
	
	// 풀이 2
	public int[] solution1(long n) {
		// n을 string 타입으로 반환
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		String[] ss = sb.toString().split("");
		
		int[] answer = new int[ss.length];
		for (int i=0;i<ss.length;i++) {
			answer[i] = Integer.parseInt(ss[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 37211;
		자연수뒤집어배열로만들기 so = new 자연수뒤집어배열로만들기();
		
		for(int i=0;i<so.solution(n).length;i++) {
			System.out.print(so.solution(n)[i] + " ");
			System.out.println(so.solution(n)[i]);
		}
	}
}


