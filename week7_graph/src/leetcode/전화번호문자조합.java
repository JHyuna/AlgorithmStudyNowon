package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 전화번호문자조합 {
	// 내 코드
	String[] letter = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		if(digits.length() == 0)
			return null;
		dfs(digits,ans,"");
		return ans;
	}
	private void dfs(String digits, List<String> ans, String str) {
		if(digits.length() == 0) {
			ans.add(str);
			return;
		}
		
		char digit = digits.charAt(0);
		
		for(int i=0;i<letter[digit-'0'].toCharArray().length;i++) {
			str += letter[digit-'0'].charAt(i);
			dfs(digits.substring(1),ans,str);
			str = str.substring(0, str.length()-1);
		}
	}
	
	//Queue 이용 (bfs)
	public List<String> letterCombinationsQueue(String digits) {
			
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		
		String[] mapping = new String[] {"0","1","abc","def","jkl","mno","pqrs","tuv","wxyz"};
		ans.add("");
		//queue에서 peek()한 것의 길이랑 digits의 길이가 다를때 
		//길이가 같으면 그것이 정답
		while(ans.peek().length() != digits.length()) {
			String remove = ans.remove();
			String map = mapping[digits.charAt(remove.length())-'0'];
			for(char c : map.toCharArray()) {
				// 맨앞에 peek()한 것에 c를 더해서 queue에 넣어줌
				ans.addLast(remove+c);
			}
		}
		return ans;
	}	
	 

	public static void main(String[] args) {
		String digits = "23";
		전화번호문자조합 num = new 전화번호문자조합();
		//num.letterCombinations(digits);
		List<String> ans = num.letterCombinations(digits);
		for(String str : ans)
			System.out.println(str);
	}

}
