package week2;

public class Reverse_String_344 {

	public static void main(String[] args) {
		char[] test = {'h','e','l','l','o'};
		
	}
	
    public static void reverseString(char[] s) {
    	char[] answer = new char[s.length];
        for(int i = 1; i <= s.length; i++) {
        	answer[i-1] = s[s.length-i];
        	
//        	System.out.println(answer[i-1]);
        }
        for(int i = 0 ; i < s.length; i++) {
        	s[i] = answer[i];
        }
    }

}
