package 문자열조작;

// 풀다 실패 -> 숫자인지 문자인지 판별하지 못함 , Character.isDigit()과 Character.isLetter() 메서드 알게됨.
public class 유효한팰린드롬 {
	
	public boolean isPalindrome(String s) {
		boolean answer = false;
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left<right) {
			if(ch[left] == ' ' || ch[left] <'A' || ch[left]> 'Z' && ch[left] < 'a' || ch[left]> 'z' ) { 
				left+=1;
				continue;
			}
			if(ch[right] == ' '|| ch[right] <'A' || ch[right]> 'Z' && ch[right] < 'a' || ch[right]> 'z') {
				right-=1;
				continue;
			}
		
			if(ch[left] == ch[right] || Character.toUpperCase(ch[left]) ==  ch[right] || 
					Character.toUpperCase(ch[right]) ==  ch[left]) {
				System.out.print(ch[left]+","+ch[right]);
				left+=1;
				right-=1;
				answer = true;
			}else {
				System.out.print(ch[left]+","+ch[right]);
				answer = false;
				break;
			}
		}
		
		return answer;
	}
	
	//도움받은 풀이
	public boolean isPalindromeNotMe(String s) {
		
		String fixed_string = "";
		
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c)) {
				fixed_string += c;
			}
		}
		
		fixed_string = fixed_string.toLowerCase();
		
		int a_pointer = 0;
		int b_pointer = fixed_string.length()-1;
		
		while(a_pointer < b_pointer) {
			if(fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)) {
				return false;
			}
			
			a_pointer+=1;
			b_pointer-=1;
		}
		return true;
	}
	
	// 또 다른 풀이
	public boolean isPalindrome3(String s) {
		boolean answer = true;
		int left = 0, right = s.length()-1;
		
		char[] ch = s.toLowerCase().toCharArray();
		while(left < right) {
			if(Character.isLetterOrDigit(ch[left]) && Character.isLetterOrDigit(ch[right])) {
				if(ch[left] != ch[right]) {
					answer =false;
					return answer;
				}else {
					answer = true;
					left+=1;
					right-=1;
				}
			}
			else if(!Character.isLetterOrDigit(ch[left])) {
				left+=1;
			}
			else {
				right-=1;
			}
		}
		return answer;
	}
	
}
