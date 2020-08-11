package 문자열조작;

public class 문자열뒤집기나은코드 {
	
	// 두 포인터, 반복, O(1)
	public void reverseString1(char[] s) {
		int left = 0, right = s.length - 1;
		
		while (left < right) {
			char tmp = s[left];
			s[left++] = s[right];
			s[right--] = tmp;
	    }
	}
	
	// 재귀, 제자리, O(N)
	public void helper(char[] s, int left, int right) {
		if(left>=right) return;
			
		char temp = s[left];
		s[left++] = s[right];
		s[right--] = temp;
			
		helper(s,left,right);
	}
		
	public void reverseString2(char[] s) {
		helper(s, 0, s.length-1);
	}
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		문자열뒤집기나은코드 best = new 문자열뒤집기나은코드();
		best.reverseString1(s);
		best.reverseString2(s);
	}

}
