package programmers;

import java.util.Arrays;

public class 모의고사 {
	public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        int[] amount = new int[3];
        int length = answers.length;
        
        for(int i=0;i<length;i++) {
        	int j1 = i%su1.length;
        	int j2 = i%su2.length;
        	int j3 = i%su3.length;
        	
        	if(su1[j1] == answers[i]) {
        		amount[0]++;
        	}
        	if(su2[j2] == answers[i]) {
        		amount[1]++;
        	}
        	if(su3[j3] == answers[i]) {
        		amount[2]++;
        	}
        }
        
        int maxx = 0;
        int idx = 0;
        int j = 0;
        int ch = 0;
        for(int i=0;i<3;i++) {
        	if(maxx < amount[i]) {
        		maxx = amount[i];
        		idx = i;
        	}
        }
        
        for(int i=0;i<3;i++) {
    	   if(amount[idx] == amount[i]) {
    		   answer[j++] = i+1;
    	   }
       }
       answer = Arrays.copyOf(answer,j); 
       return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,3,2,4,2};
		모의고사 mo = new 모의고사();
		//mo.solution(answers);
		for(int i=0;i<mo.solution(answers).length;i++) {
			System.out.print(mo.solution(answers)[i]);
		}
		
	}

}
