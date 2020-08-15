package 문자열조작;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 로그파일재정렬 {

	// 내코드 -> Arrays.sort에 대한 식을 다시 세워줘야 함. 내장된 sort 사용 불가, 재정의 필요
	// 람다식 이용한 sort 공부 필요
//	public StringBuffer[] reorderLogFilesMine(String[] logs) {
//		StringBuffer[] isLet = new StringBuffer[logs.length];
//		StringBuffer[] isNum = new StringBuffer[logs.length];
//		for(int i=0;i<logs.length;i++) {
//			String s = logs[i].substring(0,3);
//			if(s == "dig") {
//				isLet[i].append(logs[i]);
//			}else {
//				isNum[i].append(logs[i]);
//			}
//		}
//		
//		for(int i=0;i<isNum.length;i++) {
//			isLet[i].trimToSize();
//			isNum[i].trimToSize();
//		}
//		
//		
//		Arrays.sort(isLet);
//		Arrays.sort(isNum);
//		
//		int j = isLet.length;
//		for(int i=0;i<isNum.length;i++) {
//			isLet[j++].append(isNum[i]);
//		}
//		
//		return isLet;
//	}
	
	public String[] reorderLogFiles(String[] logs) {
		if(logs == null || logs.length == 0) return logs;
		
		int len = logs.length;
		List<String> letterList = new ArrayList<>();
		List<String> digitList = new ArrayList<>();
		for(String log : logs) {
			// 숫자이면
			if(Character.isDigit(log.split(" ")[1].charAt(0))) {
				digitList.add(log);
			}else {
				letterList.add(log);
			}
		}
		
		Collections.sort(letterList, (o1,o2) -> {
			String[] s1 = o1.split(" ");
			String[] s2 = o2.split(" ");
			int len1 = s1.length;
			int len2 = s2.length;
			for(int i=1;i<Math.min(len1, len2); i++) {
				if(!s1[i].equals(s2[i])) {
					return s1[i].compareTo(s2[i]);
				}
			}
			return s1[0].compareTo(s2[0]);
		});
	 
		int count = 0;
		
		while(count < letterList.size()) {
			logs[count] = letterList.get(count);
			count++;
		}
		
		int i=0;
		
		while(i < digitList.size()) {
			logs[count] = digitList.get(i);
			count++;
			i++;
		}
		
		return logs;
	}
	
	public static void main(String[] args) {
		String[] logs = {"dig1 8 1 5 1", "let1 art can","dig2 3 6", "let2 own kit dog","let3 art zero"};
		로그파일재정렬 file = new 로그파일재정렬();
		for(int i=0;i<file.reorderLogFiles(logs).length;i++) {
			System.out.println(file.reorderLogFiles(logs)[i]);
		}
	}
}

