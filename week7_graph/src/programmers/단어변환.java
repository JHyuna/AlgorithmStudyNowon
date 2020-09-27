package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*  Map 구성
 * [lot=[hot, dot, log]
	log=[dog, lot, cog],
	dot=[hot, dog, lot]
	cog=[dog, log]
	hot=[dot, lot] 
	dog=[dot, log, cog]]
*/

public class 단어변환 {
	int ansd = Integer.MAX_VALUE;
	public int solution(String begin, String target, String[] words) {
        int ans=0;
        int count = 0,answer=0;
        Map<String,List<String>> map = new HashMap<>();
        Set<String> inside = null;
        String comItem = null;
        
        // 그래프 구성
        for(int i=0;i<words.length;i++) {
        	//비교 대상
        	String item = words[i];
        	for(int j=0;j<words.length;j++) {
        		if(j!=i) {
        			//나머지 하나씩 
        			comItem = words[j];
        			for(int k=0;k<item.length();k++) {
	        			if(item.charAt(k) == comItem.charAt(k)) {
	        				count++;
	        			}	
        			}
        			if(count == item.length()-1) {
                		//처음 만든경우
                			
                		if(map.get(item) == null) {
                			map.put(item,new ArrayList<String>());
                		}
                		map.get(item).add(comItem);
                	}
        			count = 0;
        		}
        	}
        }
        //System.out.println(map.entrySet());
        
        for(int i=0;i<words.length;i++) {
        	String word = words[i];
        	for(int j=0;j<begin.length();j++) {
        		if(begin.charAt(j) == word.charAt(j)) {
        			count++;
        		}
        	}
        	// begin과 글자가 한개 다른 경우
        	if(count == begin.length()-1) {
        		answer = dfs(map,word,target,answer+1,new HashSet<>());
        	}
        	count=0;
        }
        if(ansd == Integer.MAX_VALUE)
        	return 0;
        return ansd;
    }
	
	private int dfs(Map<String,List<String>> map, String word, String target, int ans, Set<String> inside) {
		if(target.equals(word)) {
			ansd = Math.min(ansd, ans);
			return ans;
		}
		if(!inside.contains(word))
			inside.add(word);
		
		for(String w: map.get(word)) {
			if(!inside.contains(w)) {
				inside.add(w);
				ans+=1;
				ans = dfs(map,w,target,ans,inside);
				inside.remove(w);
				ans-=1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot","dot","dog","lot","log","cog"};
		단어변환 dan = new 단어변환();
		System.out.print(dan.solution(begin, target, words));
	}
}
