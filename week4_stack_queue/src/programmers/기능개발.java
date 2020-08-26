package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
	// 큐 개념 이용
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		ArrayList<Integer> p = new ArrayList<Integer>(progresses.length);
		ArrayList<Integer> s = new ArrayList<Integer>(speeds.length);
		
		for(int e : progresses) {
			p.add(Integer.valueOf(e));
		}
		for(int e : speeds)
			s.add(Integer.valueOf(e));
		
		while(p.size() != 0) {
			int cnt = 0;
			for(int i=0;i<p.size();i++){
				// progresses 와 speeds 더해
				p.set(i, (int)p.get(i)+(int)s.get(i));
			}
			
			// 100 넘는 것 처리
			while(p.size() != 0) {
				if((int)p.get(0) >= 100) {
					cnt += 1;
					p.remove(0);
					s.remove(0);
				}
				else
					break;
			}
			if(cnt != 0) {
				a.add(cnt);
			}
		}
		int[] answer = new int[a.size()];
		for(int i=0;i<a.size();i++) {
			answer[i] = (int)a.get(i);
		}
		return answer;
	}
	
	//큐 개념
	public int[] solution2(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();
		List<Integer> answerList = new ArrayList<>();
		
		for(int i=0;i<speeds.length;i++) {
			// 100이 되거나 넘는  date를 미리 예측
			double remain = (100 - progresses[i]) / (double)speeds[i];      
			int date = (int)Math.ceil(remain);
			
			// 뒷 순서의 일이 더 오래걸리면 q의 size만큼이 전에 배포됨.
			if(!q.isEmpty() && q.peek() < date) {
				answerList.add(q.size());
				q.clear();
			}
			// q의 맨뒤에 date 삽입
			q.offer(date);
		}
		
		answerList.add(q.size());
		
		int[] answer = new int[answerList.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = answerList.get(i);
		}
		
		return answer;
		
	}
	

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55, 60};
		int[] speeds = {1,30,5,6};
		기능개발 gi = new 기능개발();
		//gi.solution2(progresses, speeds);
		int[] ans = gi.solution(progresses, speeds);
		for(int a : ans)
		{
			System.out.print(a + " ");
		}
	}

}
