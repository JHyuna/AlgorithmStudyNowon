package programmers;

import java.util.Stack;

public class 주식가격 {
	// 내 풀이
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length-1;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		if(prices[i] <= prices[j]) {
        			answer[i] += 1;

        		}else {
        			answer[i] += 1;
        			break;
        		}
        	}
        }
        return answer;
    }
	
	// 스택이용
	public int[] solution2(int[] prices) {
		Stack<Integer> beginIdxs = new Stack<>();
		int i =0;
		int[] terms = new int[prices.length];
		
		beginIdxs.push(i);
		
		for(i=1;i<prices.length;i++) {
			while(!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
				int beginIdx = beginIdxs.pop();
				terms[beginIdx] = i - beginIdx;
			}
			beginIdxs.push(i);
		}
		
		while(!beginIdxs.empty()) {
			int beginIdx = beginIdxs.pop();
			terms[beginIdx] = i - beginIdx - 1;
		}
		return terms;
	}
	
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		주식가격 joo = new 주식가격();
		joo.solution2(prices);
		int[] ans = joo.solution2(prices);
		for(int an : ans) {
			System.out.print(an+" ");
		}
	}

}
