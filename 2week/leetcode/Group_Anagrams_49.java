package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//	Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//	Output:
//	[
//	  ["ate","eat","tea"],
//	  ["nat","tan"],
//	  ["bat"]
//	]

public class Group_Anagrams_49 {

	public static void main(String[] args) {

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		
		for (String tmp : strs) {
			
			// 문자 하나하나 잘라서 알파벳순으로 정렬
			char [] tmpChar = tmp.toCharArray();
			Arrays.sort(tmpChar);	
			String tmpCharStr = new String(tmpChar);
			
			// 만약 정렬해서 같은 알파벳이 있으면 배열에 넣어줌
			ArrayList<String> tmpAl = new ArrayList<String>();
			if(hm.containsKey(tmpCharStr)) {
				tmpAl = hm.get(tmpCharStr);
				tmpAl.add(tmp);
				hm.put(tmpCharStr, tmpAl);
			} else {
				tmpAl.add(tmp);
				hm.put(tmpCharStr, tmpAl);
			}
		}
		
		List<List<String>> answer = new ArrayList<List<String>>();
		for(ArrayList<String> tmpAl : hm.values()) {
			answer.add(tmpAl);
		}

		return answer;
	}

}
