package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 보석과돌 {
	
	//HashMap 이용한 풀이
    public int numJewelsInStones(String J, String S) {
    	int answer = 0;
    	Map<Character, Integer> map = new HashMap<>();
    	
    	//Map에 J 원소 저장
    	for(int i=0;i<J.length();i++) {
    		map.put(J.charAt(i),0);
    	}
    	
    	for(char ch : map.keySet()) {
    		for(int k=0;k<S.length();k++) {
    			if(S.charAt(k) == ch) {
        			answer += map.get(ch)+1;
        		}
    		}
    	}
    	return answer;
    }
    
    //HashSet 이용한 풀이
    public int numJewelsInStones2(String J, String S) {
    	int res = 0;
    	Set setJ = new HashSet();
    	for(char j : J.toCharArray())
    		setJ.add(j);
    	for(char s : S.toCharArray()) {
    		if(setJ.contains(s)) res++;
    	}
    	return res;
    }
    
	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		
		보석과돌 jew = new 보석과돌();
		System.out.print(jew.numJewelsInStones2(J, S));
			
	}

}

