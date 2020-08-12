package week2;

import java.util.Stack;

public class Valid_Palindrome_125 {

	public static void main(String[] args) {
//		isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(isPalindrome("0P"));
	}

	public static boolean isPalindrome(String s) {
		boolean answer = true;
		
		// 영어 소문자로 만들고, 숫자와 소문자만 남기고 한글자씩 잘라서 배열에 넣기
		String[] sLetter = s.toLowerCase().replaceAll("[^a-z0-9]", "").split("");
		Stack<String> stack = new Stack<String>();
		
		int i = 0;

		// 스택에 배열의 반만 넣음
		for (i = 0; i < sLetter.length / 2; i++) {
			stack.add(sLetter[i]);
		}
		
		// 문자열의 길이가 홀수일 경우 가운데 문자는 제외
		if (sLetter.length % 2 != 0) {
			i++;
		}

		// 하나씩 빼서 확인해서 다르면 false return
		while (!stack.isEmpty() && i < sLetter.length) {
			if (stack.peek().equals(sLetter[i])) {
				stack.pop();
				i++;
			} else {
				return false;
			}
		}
		return answer;

	}

}
