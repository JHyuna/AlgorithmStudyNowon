package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

//어려워
public class 일정재구성 {
	//PriorityQueue가 알아서 정렬해줌.(알파벳 순)
	HashMap<String, PriorityQueue<String>> map = new HashMap<>();
	LinkedList<String> result = new LinkedList<>();
	
	//그래프 만들기
	public List<String> findItinerary(List<List<String>> tickets) {
	   for(int i=0;i<tickets.size();i++) {
		   if(!map.containsKey(tickets.get(i).get(0))) {
	            PriorityQueue<String> q = new PriorityQueue<String>();
	            map.put(tickets.get(i).get(0), q);
	       }
	       map.get(tickets.get(i).get(0)).offer(tickets.get(i).get(1));
	   	}
	      
	    dfs("JFK");
	    return result;
	}
	
	private void dfs(String s) {
		PriorityQueue<String> q = map.get(s);
	      
		while(q!=null && !q.isEmpty()) {
			dfs(q.poll());
	    }
	    result.addFirst(s);
	}
	
	public static void main(String[] args) {
		List<List<String>> tickets = new ArrayList<List<String>>();
		for(int i=0;i<5;i++)
			tickets.add(new ArrayList<String>());
		tickets.get(0).add("JFK");
		tickets.get(0).add("SFO");
		tickets.get(1).add("JFK");
		tickets.get(1).add("ATL");
		tickets.get(2).add("SFO");
		tickets.get(2).add("ATL");
		tickets.get(3).add("ATL");
		tickets.get(3).add("JFK");
		tickets.get(4).add("ATL");
		tickets.get(4).add("SFO");
		
		일정재구성 sun = new 일정재구성();
		List<String> ans = sun.findItinerary(tickets);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
}
