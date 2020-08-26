package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class 유효한괄호 {
	
	public boolean isValid(String s) {
		if(s == null || s.isEmpty()) {
			return true;
		}
		
		Map<Character, Character> map = new HashMap<>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c=='{' || c == '[') {
				stack.add(c);
			}else {
				if(stack.isEmpty() || map.get(stack.peek()) != c) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		String s = "{[]}";
		유효한괄호 u = new 유효한괄호();
		System.out.println(u.isValid(s));
	}

}
