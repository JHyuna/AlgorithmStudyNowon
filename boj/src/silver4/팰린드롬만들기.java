package silver4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Scanner;

public class 팰린드롬만들기 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] arr = str.split("");
		String answer = "";
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],0);
			}
			map.put(arr[i],map.get(arr[i])+1);
		}
		//System.out.println(map.entrySet());
		
		boolean ans = false;
		int count = 0;
		String middle = "";
		//짝수인 경우
		if(str.length()%2 == 0) {
			for(String st :map.keySet()) {
				//map 각 문자의 갯수 짝수개수
				if(map.get(st)%2 ==0) {
					ans = true;
				}else {
					ans = false;
					break;
				}
			}
		}else {
			for(String st : map.keySet()) {
				//map 각 문자의 갯수 짝수개수
				if(map.get(st) % 2 ==0) {
					ans = true;
					count++;
				}else {
					if(!middle.equals("")) {
						ans = false;
						break; 
					}
					middle = st;
				}
			}
			if(count == str.length()/2) {
				ans = true;
			}else if(map.keySet().size() == 1)
				ans = true;
		}
		
		if(!ans) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		
		int con = 0;
		List<String> word = new ArrayList<>();
		for(String ar : arr) {
			if(ar.equals(middle) && con == 0) {
				con++;
				continue;
			}
			word.add(ar);
		}
		
		Collections.sort(word, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
	
		for(int i=0;i<word.size();i+=2) {
			answer += word.get(i);
		}
		answer+= middle;
		
		for(int i=word.size()-1;i>=0;i-=2) {
			answer+=word.get(i);
		}
		System.out.println(answer);
	}
}

