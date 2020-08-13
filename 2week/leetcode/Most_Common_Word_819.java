package week2;

import java.util.HashMap;

public class Most_Common_Word_819 {

	public static void main(String[] args) {
		System.out.println("abc abc? abcd the jeff!".replaceAll("\\b" + "abc" + "\\b", "123"));
		mostCommonWord("abc abc? abcd the jeff!", new String[] { "abc", "abcd", "jeff" });
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase().replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", " ");

		for (String ban : banned) {
			paragraph = paragraph.replaceAll("\\b" + ban + "\\b", "");	// 공백...
			if (paragraph.equals(ban)) {
				paragraph = "";
			}
		}
		paragraph = paragraph.trim().replace("(\\w)(\\s+)([\\w])", " ");

		int max = 0;
		String maxWord = "";

		HashMap<String, Integer> hm = new HashMap<>();
		// 최빈값 구하기..
		for (String word : paragraph.split(" ")) {
			if (word.equals("")) {
				continue;
			}
			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
				if (hm.get(word) + 1 > max) {
					max = hm.get(word) + 1;
					maxWord = word;
				}
			} else {
				hm.put(word, 1);
				if (max == 0) {
					max = hm.get(word) + 1;
					maxWord = word;
				}
			}
		}

		return maxWord;
	}
}
