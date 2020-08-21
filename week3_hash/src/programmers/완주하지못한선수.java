package programmers;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        int c = 0;
        Map<String,Integer> map = new HashMap<>();
        
        //모든 participant를 map에 갯수에 따라 value값 주어 저장
        for(int i=0;i<participant.length;i++) {
        	if(map.containsKey(participant[i])) {
        		c = map.get(participant[i]);
        		map.put(participant[i], c+1);
        	}else {
        		map.put(participant[i], c+1);
        	}
        	c = 0;
        }
        
        //completion 이름에 해당하는 이름이 map 있으면 1씩 빼줘
        for(int i=0;i<completion.length;i++) {
        	if(map.containsKey(completion[i])) {
        		System.out.println(completion[i]);
        		c = map.get(completion[i]);
        		map.put(completion[i], c-1);
        	}
        }
        
        // value값이 0이 아닌 경우를 리턴
        for(int i=0;i<participant.length;i++) {
        	if(map.get(participant[i]) != 0) {
        		answer = participant[i];
        	}
        }
       
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		완주하지못한선수 wan = new 완주하지못한선수();
		System.out.print(wan.solution(participant, completion));
	}
}
