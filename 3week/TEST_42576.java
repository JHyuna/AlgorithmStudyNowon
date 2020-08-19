import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TEST_42576 {
//	https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
	public static void main(String[] args) {

	}
	
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // <이름, 명수>
        HashMap<String, Integer> hm = new HashMap<>();
        
        // 완주자 명단 돌면서 hm에 넣어주기
        for( String tmp : completion) {
        	if(hm.containsKey(tmp)) {
        		hm.put(tmp, hm.get(tmp)+1);
        	} else {
        		hm.put(tmp, 1);
        	}
        }
        
        // 참가자명단
        for(String tmp : participant) {
        	if(hm.containsKey(tmp)) {
        		if(hm.get(tmp) > 1) {	// 1명 이상 있으면 -1
        			hm.put(tmp, hm.get(tmp)-1);
        		} else {				// 아니면 없애줌
        			hm.remove(tmp);
        		}
        	} else {
        		answer = tmp;
        		break;
        	}
        }
        
        return answer;
    }

}
