package week1;

public class 문자열내p와y의개수 {
	boolean solution(String s) {
		boolean answer = true;
		char[] schar = s.toCharArray();
		
		int chp = 0;
		int chy = 0;
		
		for(int i=0;i<s.length();i++) {
			if(schar[i] == 'p' || schar[i] == 'P') {
				chp += 1;
			}
			else if(schar[i] == 'y' || schar[i] == 'Y'){
				chy += 1;
			}else {
				continue;
			}
		}
		
		if(chp != chy) {
			answer = false;
		}
		return answer;
	}
	public static void main(String[] args) {
		String s = "";
		문자열내p와y의개수 py = new 문자열내p와y의개수();
		System.out.print(py.solution(s));
	}
}
