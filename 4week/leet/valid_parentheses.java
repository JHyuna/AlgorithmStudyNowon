package week3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class valid_parentheses {

	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
	}

	public static boolean isValid(String s) {
		
		if(s.equals("")) {
			return true;
		}

		Stack<String> stack = new Stack<String>();

		String[] tmp = s.split("");
		
		HashMap<String, String> hm = new HashMap<String, String>() {
			{
				put("(", ")");
				put("{", "}");
				put("[", "]");
			}
		};

		Set<String> open = hm.keySet();

		for (String ts : tmp) {
			if (open.contains(ts)) {
				stack.add(ts);
			} else if (!stack.isEmpty()) {
				if (hm.get(stack.peek()).equals(ts)) {
					stack.pop();
					continue;
				}
				return false;
			} else {
				return false;
			}
		}
		return stack.isEmpty() ? true : false;
	}
}