package 문자열조작;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 금지된 단어를 제외하고 가장 많이 등장한 단어를 반환
// , 같은 것들 제거하기 -> replace 사용
// Map을 value를 기준으로 정렬 x
public class 가장흔한단어 {

public String mostCommonWordMine(String paragraph, String[] banned) {
		
		Map<String,Integer> map = new HashMap<>();
		String bann = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
		
		//공백 제거 후 반드시 하나의 문자가 와야해
		String[] ban = bann.split("\\s+");
		
		for(int i=0;i<ban.length;i++) {
            int ch = 1;
			if(map.containsKey(ban[i])) {
				ch = map.get(ban[i]);
				map.put(ban[i], ch+1);
			}
			else {
				map.put(ban[i], ch);
			}
		}
		
		for(String word : banned) {
			if(map.containsKey(word)) {
				map.put(word, 0);
			}
		}
		
		int max = 0;
		String res = "";
		for(String str : map.keySet()) {
			if(map.get(str) > max) {
				max = map.get(str);
				res = str;
			}
		}
		return res;
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
		
		String[] words = normalizedStr.split("\\s+");
		
		Set<String> bannedWords = new HashSet();
		for(String word : banned) {
			bannedWords.add(word);
		}
		
		Map<String,Integer> wordCount = new HashMap();
		for(String word : words) {
			if(!bannedWords.contains(word)) {
				wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			}
		}
		
		return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		가장흔한단어 hun = new 가장흔한단어();
		System.out.println(hun.mostCommonWordMine(paragraph,banned));
		System.out.print(hun.mostCommonWord(paragraph,banned));
	}
}


