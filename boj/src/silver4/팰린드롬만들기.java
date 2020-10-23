package silver4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 팰린드롬만들기 {
	public static void main(String args[]) throws Exception {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> map = new HashMap<>();
		String[] word = br.readLine().split("");
		
		for(int i=0; i < word.length; i++) {
			for(int j=0; j < i; j++) {
				if(word[i].equals(word[j])) {
					map.put(word[j],map.get(word[j])+1);
					break;
				}
			}
			if(map.get(word[i]) == null) {
				map.put(word[i], 1);
			}
		}
		//홀수개인 경우 middle이 존재, 짝수면 없음
		String middle = "";
		int count = 0;
		for(String key : map.keySet()){
			if(map.get(key) % 2 != 0) {
				middle = key;
				map.put(key, map.get(key)-1);
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		
		List<String> list = new ArrayList<>();
		for(String key : map.keySet()) {
			for(int i=0; i < map.get(key); i++) {
				list.add(key);
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < list.size(); i+=2) {
			sb.append(list.get(i));
		}
		sb.append(middle);
		for(int i=list.size()-1; i >= 1; i-=2) {
			sb.append(list.get(i));
		}
		
		System.out.println(sb);
	}
}
