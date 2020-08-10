package week1;

public class 문자열다루기기본 {
	
	public boolean solution(String s) {
		boolean answer = true;
		char[] ch = s.toCharArray();
		
		if(ch.length != 4 && ch.length != 6) {
			answer = false;
		}else {
			for(int i=0;i<ch.length;i++) {
				if((int)ch[i] < 48 || (int)ch[i] > 57) {
					answer = false;
					break;
				}else {
					answer = true;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "a234";
		문자열다루기기본 mun = new 문자열다루기기본();
		System.out.print(mun.solution(s));
	}
}	
