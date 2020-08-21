package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 중복문자없는가장긴부분문자열 {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j=0;
		while(i < n && j < n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
	
	public int lengthOfLongestSubstring2(String s) {
		int n = s.length();
		int ans = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<=n; j++) {
				System.out.println(i+","+j);
				if(allUnique(s,i,j)) {
					ans = Math.max(ans, j-i);
					System.out.println(ans);
				}
			}
		}
		return ans;
	}
	
	public boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for(int i=start;i<end;i++) {
			Character ch = s.charAt(i);
			if(set.contains(ch)) 
				return false;
			set.add(ch);
		}
		return true;
	}
	
	// 슬라이딩 윈도우와 투 포인터로 사이즈 조절
	public int lengthOfLongestSubstring3(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int j=0,i=0; j<n; j++) {
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)),i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j+1);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "pwwkew";
		중복문자없는가장긴부분문자열 jjung = new 중복문자없는가장긴부분문자열();
		//jjung.lengthOfLongestSubstring(s);
		System.out.print(jjung.lengthOfLongestSubstring3(s));
	}

}
