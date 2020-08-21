package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {}, ans = {};
        int ch = 0, j=0, com=0;
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> exist = new HashMap<>();
        String[] maxx = {};
        //각 장르별로 재생 횟수 총 합
        for(int i=0;i<genres.length;i++) {
        	if(exist.containsKey(genres[i])) {
        		exist.put(genres[i],exist.get(genres[i])+plays[i]);
        	}else {
        		// ch 개의 장르가 존재
        		ch++;
        		exist.put(genres[i],plays[i]);
        	}
        }
        
        maxx = new String[ch];
        String next = "";
        
        // 장르 순으로 나열 
        while(j < ch) {
        	for(String s : exist.keySet()) {
            	if(exist.get(s) > com) {
            		com = exist.get(s);
            		next = s;
            	}
            }
        	maxx[j] = next;
        	exist.put(next, 0);
        	com = 0;
        	j++;
        }
        
        answer = new int[ch*2];
        ans = new int[ch*2];
        int i = 0, l = 0, n=0;
        int index = 0;
        
        //각 장르별로 2개씩 추출
	    while(n < ch*2){
	    	answer[n] = 0;
	    	if(n!=0 && n % 2 == 0) {
	    		i++;
	    	}
	    	
	    	for(int k=0;k<genres.length;k++) {
	        	if(genres[k].equals(maxx[i])) {
	        		if(answer[n] < plays[k]) {
	        			answer[n] = plays[k];
	        	        index = k;
	        		}
	        	}
	        }
	    	plays[index] = 0;
	    	if(l!=0 && ans[l-1] == index) {
	    		ans = Arrays.copyOf(ans, ans.length-1);
	    		n++;
	    		continue;
	    	}
	    	ans[l] = index;
	    	l++;
	    	n++;
        }
	    
        return ans;
	}
        
	
	public static void main(String[] args) {
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,150,800,2500};
		베스트앨범 best = new 베스트앨범();
		int[] answer = best.solution(genres, plays);
		for(int a : answer) {
			System.out.println(a);
		}
	}

}
