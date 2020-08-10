package week1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	
	public long solution(long n) {
		long answer = 0;
		String temp = Long.toString(n);
		Integer[] digits = new Integer[temp.length()];
		
		// digits에 answer의 각 하나씩의 수 대입
		for(int i=0;i < temp.length(); i++) {
			digits[i] = temp.charAt(i) - '0';
		}
		
		Arrays.sort(digits,Collections.reverseOrder());
		
		
		for(long digit : digits) 
		{
			answer *= 10;
			answer += digit;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		long n =118372;
		정수내림차순으로배치하기 in = new 정수내림차순으로배치하기();
		System.out.print(in.solution(n));
		
	}
}
