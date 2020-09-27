package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

// [ICN=[ATL, SFO], ATL=[ICN, SFO], SFO=[ATL]]
public class 여행경로 {
	
	public String[] solution(String[][] tickets) {
		int tickLeg = tickets.length+1;
        String[] answer = new String[tickets.length+1];
        Map<String,PriorityQueue<String>> map = new HashMap<>();
        Set<String> last = new HashSet<String>();
        if(tickets.length == 0)
        	return answer;
        for(int i=0;i<tickets.length;i++) {
        	if(map.get(tickets[i][0]) == null) {
        		map.put(tickets[i][0], new PriorityQueue<String>());
        	}
        	map.get(tickets[i][0]).add(tickets[i][1]);
        }
        
        //System.out.println(map.entrySet());
        
        answer[0] = "ICN";
        dfs(map,answer,"ICN",tickLeg,1,last);
        
        for(int i=0;i<answer.length;i++) {
        	if(answer[i] == null) {
		        for(String ls : last) {
					answer[i++] = ls;
		        }
        	}
        }
       
        return answer;
    }
	
	private void dfs(Map<String, PriorityQueue<String>> map, String[] answer, String key, int ticketLeg,int index, Set<String> last) {
	
		if(ticketLeg < 0) {
			return;
		}
		
		for(String ans : map.get(key)) {
			System.out.println("ans: "+ans);
			if(map.get(ans) == null) {
				last.add(ans);
				continue;
			}
			answer[index] = ans;
			map.get(key).remove(ans);
			dfs(map,answer,ans,ticketLeg-1,index+1,last);
		}
	}

	public static void main(String[] args) {
		//String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[][] tickets = {{"ICN" ,"B"}, {"B", "C"} ,{"C", "ICN"}, {"ICN", "D"},{"ICN","E"},{"E","F"}};
		여행경로 jor = new 여행경로();
		String[] str = jor.solution(tickets);
		for(String s : str) {
			System.out.print(s + " ");
		}
	}

}
