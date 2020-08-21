package programmers;

import java.util.Arrays;
import java.util.HashSet;

public class 전화번호목록 {
	
	// 효율성 실패
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        String book ="" ;
        int[] phone_num = new int[phone_book.length];
        for(int i=0;i<phone_book.length;i++) {
        	phone_num[i] = Integer.parseInt(phone_book[i]);
        }
        Arrays.sort(phone_num);

        for(int i=0;i<phone_book.length;i++) {
        	 phone_book[i] = Integer.toString(phone_num[i]);
        }
        for(int i=0;i<phone_book.length-1;i++) {
        	for(int j=i+1;j<phone_book.length;j++) {
        		if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))){
            		answer = false;
            		return answer;
            	}
        	}
        }
        return answer;
    }
	
	public boolean solution2(String[] phone_book) {
        boolean answer = true;
        String book ="" ;
        
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=0;j<phone_book.length;j++) {
        		if(i == j) {
        			continue;
        		}
        		if(phone_book[i].length() < phone_book[i].length()) {
        			if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))){
                		answer = false;
                		return answer;
                	}
        		}
        	}
        }
        return answer;
    }
	
	//hash 활용하여 코딩
	public boolean solution3(String[] phone_book) {
		boolean answer = true;
		HashSet<String> hs = new HashSet<>();
		
		Arrays.sort(phone_book, (a,b) -> Integer.compare(a.length(),b.length()));
		
		for(String sb : phone_book) {
			hs.add(sb);
		}
		
		for(String rb : phone_book) {
			hs.remove(rb);
			for(String s : hs) {
				if(s.indexOf(rb) == 0) {
					answer = false;
					return answer;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119","1195524421","97674223"};
		전화번호목록 ph = new 전화번호목록();
		System.out.print(ph.solution(phone_book));
	}
}
