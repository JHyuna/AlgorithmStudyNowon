package 문자열조작;

public class 문자열뒤집기 {
	
	public void reverseString(char[] s) {
		
		StringBuilder buf = new StringBuilder(s.length);
		
		for(int i=0;i<s.length;i++) {
			buf.append(s[i]);
		}
		buf = buf.reverse();
		
		for(int i=0;i<buf.length();i++) {
			System.out.print(buf.charAt(i));
		}
	}
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		문자열뒤집기 mun = new 문자열뒤집기();
		mun.reverseString(s);
	}

}
